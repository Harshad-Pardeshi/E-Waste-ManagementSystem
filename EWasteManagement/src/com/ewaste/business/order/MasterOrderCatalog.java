/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.order;

import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class MasterOrderCatalog {
    private ArrayList<Orders> ordersList;

    public MasterOrderCatalog() {
        ordersList = new ArrayList<>();
    }

    public ArrayList<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Orders> ordersList) {
        this.ordersList = ordersList;
    }
    
}
