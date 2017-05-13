/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.Role;
import com.ewaste.business.role.SellerRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SalesOrganization extends Organization{

    public SalesOrganization() {
        super(Organization.Type.Sales.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SellerRole());
        return roles;
    }
}
