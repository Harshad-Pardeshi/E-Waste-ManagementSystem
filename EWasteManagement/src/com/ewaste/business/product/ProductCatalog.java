/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.product;

import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class ProductCatalog {
    ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addNewProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }
}
