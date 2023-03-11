package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.BaseEntity;
import com.mcll.cms.data.repository.BaseRepository;

import java.lang.reflect.Field;
import java.util.List;

public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {


    private final BaseRepository repository;

    public BaseServiceImpl(BaseRepository repository) {
        this.repository = repository;
    }


    @Override
    public T getById(long id) {
        //TODO: Exception'lar genericleştirilecek
        try {
            return (T) repository.findById(id).orElseThrow(() -> new RuntimeException("Entity Not Found"));
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T create(T entity) {
        return (T) repository.save(entity);
    }

    @Override
    public T update(long id, T entity) {
        T existingEntity = (T) repository.findById(id).orElse(null);
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
            repository.save(existingEntity);
        }
        return existingEntity;

    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<T> getAll() {
        return (List<T>) repository.findAll();
    }

}
