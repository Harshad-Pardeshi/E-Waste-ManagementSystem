/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.product;

import java.util.Date;

/**
 *
 * @author Harshad 0509
 */
public class Product implements Comparable<Product>{
    private String productName;
    private String productManufacturer;
    private String producDescription;
    private static long count = 1;
    private long productId;
    private String productFeatures;
    private double ceilPrice;
    private double floorPrice;
    private double sellingPrice;
    private String category;
    private Date dateOfManufacturer;
    private double quantity;
    private double nonFerrousMetals;

    public double getNonFerrousMetals() {
        return nonFerrousMetals;
    }

    public void setNonFerrousMetals(double nonFerrousMetals) {
        this.nonFerrousMetals = nonFerrousMetals;
    }
    

    public Product() {
        productId = count++;
        dateOfManufacturer = new Date();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public String getProducDescription() {
        return producDescription;
    }

    public void setProducDescription(String producDescription) {
        this.producDescription = producDescription;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductFeatures() {
        return productFeatures;
    }

    public void setProductFeatures(String productFeatures) {
        this.productFeatures = productFeatures;
    }

    public double getCeilPrice() {
        return ceilPrice;
    }

    public void setCeilPrice(double ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateOfManufacturer() {
        return dateOfManufacturer;
    }

    public void setDateOfManufacturer(Date dateOfManufacturer) {
        this.dateOfManufacturer = dateOfManufacturer;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  productName  ;
    }
	 @Override
    public int compareTo(Product o) {
        int basePrice = (int)(o.getFloorPrice());
        
        //ascending order
        return (int)this.floorPrice - basePrice;
    }
    
}
