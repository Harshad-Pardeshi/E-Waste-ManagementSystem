/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.role;

import com.ewaste.business.EcoSystem;
import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.organization.DismantleOrganization;
import com.ewaste.business.organization.Organization;
import com.ewaste.business.useraccount.UserAccount;
import com.ewaste.ui.dismantleworkarea.DismantleDeptWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DismantleRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
       // return null;
       return new DismantleDeptWorkAreaPanel(userProcessContainer, account, (DismantleOrganization)organization,enterprise);
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
