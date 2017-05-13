/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.enterprise;

import com.ewaste.business.organization.Organization;
import com.ewaste.business.organization.OrganizationDirectory;

/**
 *
 * @author Harshad 0509
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String enterpriseName, EnterpriseType type) {
        super(enterpriseName);
        organizationDirectory = new OrganizationDirectory();
        this.enterpriseType = type;
    }

    public enum EnterpriseType {
        MyRecycler("My Recycler"),
        Manufacturer("Manufacturer"),
        OtherRecycler("Other Recycler");

        private EnterpriseType(String value) {
            this.value = value;
        }

        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    @Override
    public String toString() {
        return getName();
    }
}
