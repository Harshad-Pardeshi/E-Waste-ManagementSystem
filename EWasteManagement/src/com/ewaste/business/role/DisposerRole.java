/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.role;

import com.ewaste.business.EcoSystem;
import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.organization.DisposalOrganization;
import com.ewaste.business.organization.Organization;
import com.ewaste.business.useraccount.UserAccount;
import com.ewaste.ui.disposalWorkArea.DisposalWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DisposerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
//        return null;
        return new DisposalWorkAreaJPanel(userProcessContainer, account, (DisposalOrganization)organization, enterprise, network);
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
