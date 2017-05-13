/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.workqueue;

/**
 *
 * @author raunak
 */
public class UserWorkRequest extends WorkRequest{
    
    private String sortingMethod;
    private boolean isRecyclable;

    public String getSortingMethod() {
        return sortingMethod;
    }

    public void setSortingMethod(String sortingMethod) {
        this.sortingMethod = sortingMethod;
    }

    public boolean isIsRecyclable() {
        return isRecyclable;
    }

    public void setIsRecyclable(boolean isRecyclable) {
        this.isRecyclable = isRecyclable;
    }
}
