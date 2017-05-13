/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.AccountantRole;
import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AccountingOrganization extends Organization{

    public AccountingOrganization() {
        super(Organization.Type.Accouunts.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }
}
