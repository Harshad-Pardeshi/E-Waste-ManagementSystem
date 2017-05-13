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
public class MyRecyclerEnterprise  extends com.ewaste.business.enterprise.Enterprise{

    public MyRecyclerEnterprise(String enterpriseName) {
        super(enterpriseName, EnterpriseType.MyRecycler);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
