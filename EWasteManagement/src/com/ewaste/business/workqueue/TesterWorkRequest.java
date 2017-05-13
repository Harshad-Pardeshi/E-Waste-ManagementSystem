/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.workqueue;

import com.ewaste.business.product.Product;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TesterWorkRequest extends WorkRequest{
    
    private ArrayList<Product> newCompomnentList;

    public TesterWorkRequest() {
        this.newCompomnentList = new ArrayList();
    }

    public ArrayList<Product> getNewCompomnentList() {
        return newCompomnentList;
    }

    public void setNewCompomnentList(ArrayList<Product> newCompomnentList) {
        this.newCompomnentList = newCompomnentList;
    }
    
    
}
