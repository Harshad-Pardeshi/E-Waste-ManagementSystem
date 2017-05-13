/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.UserRole;
import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserOrganization extends Organization{

    public UserOrganization() {
        super(Organization.Type.User.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UserRole());
        return roles;
    }
     
}