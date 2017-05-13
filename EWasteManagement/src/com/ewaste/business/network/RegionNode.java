/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.network;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author tanma
 */
public class RegionNode extends DefaultMutableTreeNode {
    
    Region region;
    
    public RegionNode(Region region)
    {
        super(region.getRegionName());
        this.region = region;
    }
    
    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    
    
}
