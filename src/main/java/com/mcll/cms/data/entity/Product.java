package com.mcll.cms.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Product extends BaseEntity {

    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private double salePrice;


    public Product() {
        super();
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

}
