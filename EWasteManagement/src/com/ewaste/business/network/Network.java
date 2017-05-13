/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.network;

import com.ewaste.business.enterprise.EnterpriseDirectory;
import com.ewaste.business.product.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> subNetworkList;
    private ProductCatalog productCatlog;
    private RegionNode regionNode;

    public Network(String name) {
        this.name = name;
        enterpriseDirectory = new EnterpriseDirectory();
        subNetworkList = new ArrayList<>();
        productCatlog = new ProductCatalog();
        regionNode = new RegionNode(new Region(name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public ArrayList<Network> getSubNetworkList() {
        return subNetworkList;
    }

    public void setSubNetworkList(ArrayList<Network> subNetworkList) {
        this.subNetworkList = subNetworkList;
    }

    public ProductCatalog getProductCatlog() {
        return productCatlog;
    }

    public void setProductCatlog(ProductCatalog productCatlog) {
        this.productCatlog = productCatlog;
    }

    public RegionNode getRegionNode() {
        return regionNode;
    }

    public void setRegionNode(RegionNode regionNode) {
        this.regionNode = regionNode;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
