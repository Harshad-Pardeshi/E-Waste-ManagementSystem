/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.SortingRole;
import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SortingOrganization extends Organization{

    public SortingOrganization() {
        super(Organization.Type.Sorting.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SortingRole());
        return roles;
    }
     
   
    
    
}
