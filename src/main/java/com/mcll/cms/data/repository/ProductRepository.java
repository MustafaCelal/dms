package com.mcll.cms.data.repository;

import com.mcll.cms.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByDeletedFalse();

    List<Product> findByDeletedTrue();
}
