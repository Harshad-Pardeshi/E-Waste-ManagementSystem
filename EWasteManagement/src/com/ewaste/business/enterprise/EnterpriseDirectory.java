/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.enterprise;

import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    //Create enterpise
    public Enterprise createAndAddEnterprise(String enterpriseName, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Manufacturer){
            enterprise = new com.ewaste.business.enterprise.ManufacturerEnterprise(enterpriseName);
        }else if(type == Enterprise.EnterpriseType.MyRecycler){
            enterprise = new com.ewaste.business.enterprise.MyRecyclerEnterprise(enterpriseName);
        }else if(type == Enterprise.EnterpriseType.OtherRecycler){
            enterprise = new com.ewaste.business.enterprise.OtherRecyclerEnterprise(enterpriseName);
        }
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}
