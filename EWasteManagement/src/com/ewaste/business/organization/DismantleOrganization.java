/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.DismantleRole;
import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class DismantleOrganization extends Organization{

    public DismantleOrganization() {
        super(Organization.Type.Dismantle.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DismantleRole());
        return roles;
    }
}
