package com.accenture.ws.impl;

import com.accenture.ws.entity.Order;
import com.accenture.ws.entity.CafeClerk;
import java.util.ArrayList;
import java.util.List;

public abstract class OrderBill {
    private List<Order> orderList = new ArrayList<>();
    private CafeClerk clerk;

    public OrderBill(CafeClerk clerk) {
        this.clerk = clerk;
    }

    public CafeClerk getClerk() {
        return clerk;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public abstract double getTotalBill();
}