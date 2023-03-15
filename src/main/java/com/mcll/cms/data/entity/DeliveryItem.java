package com.mcll.cms.data.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DeliveryItem extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "deliveryId", nullable = false)
    @JsonBackReference
    private Delivery delivery;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private double productPrice;

    @Column(nullable = false)
    private double quantity;

    @Column(nullable = false)
    private double subTotal;


    public DeliveryItem() {
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
