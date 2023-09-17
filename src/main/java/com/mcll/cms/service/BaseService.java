package com.mcll.cms.service;

import com.mcll.cms.domain.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity> {

    T getById(long id);

    T create(T entity);

    T update(long id, T entity);

    void delete(long id);

    List<T> getAll();

}
