package com.accenture.ws.entity;

import com.accenture.ws.impl.OrderBill;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CafeClerk {
    private String name;

    public CafeClerk() {
        this.name = "Jane Doe";
    }

    public CafeClerk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public OrderBill calculateTotalRegularBill(List<Order> allOrders) {
        RegularBill regularBill = new RegularBill(this);
        regularBill.setOrderList(allOrders);
        return regularBill;
    }

    public OrderBill calculateTotalDiscountedBill(List<Order> allOrders) {
        DiscountedBill discountedBill = new DiscountedBill(this);
        discountedBill.setOrderList(allOrders);
        return discountedBill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClerkName() {
        return this.name;
    }
}