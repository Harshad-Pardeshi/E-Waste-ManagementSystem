/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.workqueue;

import com.ewaste.business.workqueue.WorkRequest;

/**
 *
 * @author raunak
 */
public class SortingWorkRequest extends WorkRequest{
    
    private boolean isRecyclable;

    public boolean isIsRecyclable() {
        return isRecyclable;
    }

    public void setIsRecyclable(boolean isRecyclable) {
        this.isRecyclable = isRecyclable;
    }

    
    
}
