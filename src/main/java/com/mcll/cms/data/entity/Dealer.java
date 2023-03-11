package com.mcll.cms.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Dealer extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column
    private String address;
    @Column
    private String phoneNumber;
    @Column(nullable = false)
    private double debt;


    public Dealer() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }
}
