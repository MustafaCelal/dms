package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    Product findById(long id);

    Product create(Product product);

    Product update(long id, Product product);

    void delete(long id);

    List<Product> getAllProducts();

    List<Product> getAllDeletedProducts();
}
