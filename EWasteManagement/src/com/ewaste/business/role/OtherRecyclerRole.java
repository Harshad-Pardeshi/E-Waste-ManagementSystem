/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.role;

import com.ewaste.business.EcoSystem;
import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.network.Network;
import com.ewaste.business.organization.Organization;
import com.ewaste.business.organization.ReceiverOrganization;
import com.ewaste.business.useraccount.UserAccount;
import com.ewaste.ui.thirdparty.ThirdRecyclerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Jyotsna Khatter
 */
public class OtherRecyclerRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
            return new ThirdRecyclerWorkArea(userProcessContainer, account, (ReceiverOrganization)organization, enterprise,network);
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
