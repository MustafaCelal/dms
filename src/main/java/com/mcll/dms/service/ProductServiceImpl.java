package com.mcll.dms.service;

import com.mcll.dms.domain.Product;
import com.mcll.dms.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }
}
