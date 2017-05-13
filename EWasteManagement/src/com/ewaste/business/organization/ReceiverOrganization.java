/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.role.ReceiverRole;
import com.ewaste.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class ReceiverOrganization extends Organization{

    public ReceiverOrganization() {
        super(Organization.Type.Receiver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceiverRole());
        return roles;
    }
}
