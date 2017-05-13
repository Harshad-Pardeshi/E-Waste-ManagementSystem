/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.order;

import com.ewaste.business.product.Product;
import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class Orders {

    private int ordersId;
    private static int count = 1;
    private ArrayList<OrderItem> orderItemList;
    private double totalPrice;
    private double shippingCharges;

    public Orders() {
        orderItemList = new ArrayList<>();
        ordersId = count++;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getShippingCharges() {
        return shippingCharges;
    }

    public void setShippingCharges(double shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    public OrderItem addOrder(Product p, int quantity) {
        OrderItem oi = new OrderItem();
        oi.setProduct(p);
        oi.setQuantity(quantity);
        return oi;
    }

}
