/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.Role;
import com.ewaste.business.role.TesterRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class TestingOrganization extends Organization{

    public TestingOrganization() {
        super(Organization.Type.Testing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TesterRole());
        return roles;
    }
}
