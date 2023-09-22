package com.mcll.dms.web;

import com.mcll.dms.service.BaseService;
import com.mcll.dms.domain.BaseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends BaseEntity> {

    private final BaseService baseService;

    public BaseController(BaseService baseService) {
        this.baseService = baseService;
    }


    @GetMapping
    public List<T> get() {
        return baseService.getAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable("id") long id) {
        return (T) baseService.getById(id);
    }

    @PostMapping
    public T create(@RequestBody T entity) {
        return (T) baseService.create(entity);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable("id") long id, @RequestBody T entity) {
        return (T) baseService.update(id, entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        baseService.delete(id);
    }

}

