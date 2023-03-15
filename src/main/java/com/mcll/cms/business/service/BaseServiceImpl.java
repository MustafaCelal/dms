package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.BaseEntity;
import com.mcll.cms.data.repository.BaseRepository;

import java.lang.reflect.Field;
import java.util.List;

public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {


    private final BaseRepository baseRepository;

    public BaseServiceImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }


    @Override
    public T getById(long id) {
        //TODO: Exception'lar genericleştirilecek
        try {
            return (T) baseRepository.findById(id).orElseThrow(() -> new RuntimeException("Entity Not Found"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T create(T entity) {
        return (T) baseRepository.save(entity);
    }

    @Override
    public T update(long id, T entity) {
        T existingEntity = (T) baseRepository.findById(id).orElse(null);
        if (existingEntity != null) {
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    Object value = field.get(entity);

                    if (value != null) {
                        field.set(existingEntity, value);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            baseRepository.save(existingEntity);
        }
        return existingEntity;

    }

    @Override
    public void delete(long id) {
        baseRepository.deleteById(id);
    }

    @Override
    public List<T> getAll() {
        return (List<T>) baseRepository.findAll();
    }

}
