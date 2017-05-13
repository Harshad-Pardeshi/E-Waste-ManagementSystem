/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business;

import com.ewaste.business.enterprise.Enterprise;
import com.ewaste.business.organization.Organization;
import com.ewaste.business.role.Role;
import com.ewaste.business.role.SystemAdminRole;
import com.ewaste.business.network.Network;
import java.util.ArrayList;

/**
 *
 * @author Harshad 0509
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    private EcoSystem() {
        super("Eco System");
        networkList = new ArrayList<Network>();
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportedRoles = new ArrayList<Role>();
        supportedRoles.add(new SystemAdminRole());
        return supportedRoles;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    
    public Network createAndAddNetwork(String name){
        Network network = new Network(name);
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network){
        networkList.remove(network);
    }
    
    public boolean checkIfUserNameIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
            return false;
        
        for(Network n : networkList){
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if(!e.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                    return false;
                }
                for(Organization org :e.getOrganizationDirectory().getOrganizationList()){
                    if(!org.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
