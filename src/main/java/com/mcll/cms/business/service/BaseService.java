package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    T getById(long id);

    T create(T entity);

    T update(long id, T entity);

    void delete(long id);

    List<T> getAll();

}
