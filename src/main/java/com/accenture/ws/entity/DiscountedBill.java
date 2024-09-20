package com.accenture.ws.entity;

import com.accenture.ws.impl.OrderBill;

import java.util.List;

public class DiscountedBill extends OrderBill {

    public DiscountedBill(CafeClerk clerk) {
        super(clerk);
    }

    public double getTotalBill() {
        List<Order> orders = getOrderList();
        return Math.round(
                orders.stream()
                        .mapToDouble(order -> order.getIsDiscounted() ? order.getPrice() * 0.05 : order.getPrice())
                        .sum() * 100.0) / 100.0;
    }
}