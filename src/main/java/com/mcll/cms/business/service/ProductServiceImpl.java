package com.mcll.cms.business.service;

import com.mcll.cms.data.entity.Product;
import com.mcll.cms.data.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findByDeletedFalse();
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(long id, Product product) {
        Product toUpdate = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
        toUpdate.setProductName(product.getProductName());
        toUpdate.setSalePrice(product.getSalePrice());

        return productRepository.save(toUpdate);
    }

    @Override
    public void delete(long id) {
        Product toDelete = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
        toDelete.setDeleted(true);
        productRepository.save(toDelete);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllDeletedProducts() {
        return productRepository.findByDeletedTrue();
    }
}
