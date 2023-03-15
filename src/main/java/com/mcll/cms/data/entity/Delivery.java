package com.mcll.cms.data.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Delivery extends BaseEntity {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Dealer dealer;
    @Column(nullable = false)
    private LocalDateTime deliveryTime;
    @Column(nullable = false)
    private double totalAmount;
    @Column(nullable = false)
    private double paidAmount;
    @Column(nullable = false)
    private double remainingAmount;
    @Column(nullable = false)
    private double previousDebt;
    @Column(nullable = false)
    private double newDebt;
    @OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<DeliveryItem> deliveryItems;


    public Delivery() {
    }


    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getPreviousDebt() {
        return previousDebt;
    }

    public void setPreviousDebt(double previousDebt) {
        this.previousDebt = previousDebt;
    }

    public double getNewDebt() {
        return newDebt;
    }

    public void setNewDebt(double newDebt) {
        this.newDebt = newDebt;
    }

    public List<DeliveryItem> getDeliveryItems() {
        return deliveryItems;
    }

    public void setDeliveryItems(List<DeliveryItem> deliveryItems) {
        this.deliveryItems = deliveryItems;
    }


}
