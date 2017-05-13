/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewaste.business.organization;

import com.ewaste.business.organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.User.getValue())) {
            organization = new UserOrganization();
        } else if (type.getValue().equals(Type.Sorting.getValue())) {
            organization = new SortingOrganization();
        } else if (type.getValue().equals(Type.Disposal.getValue())) {
            organization = new DisposalOrganization();
        } else if (type.getValue().equals(Type.Dismantle.getValue())) {
            organization = new DismantleOrganization();
        } else if (type.getValue().equals(Type.Extraction.getValue())) {
            organization = new ExtractionOrganization();
        } else if (type.getValue().equals(Type.Receiver.getValue())) {
            organization = new ReceiverOrganization();
        } else if (type.getValue().equals(Type.Sales.getValue())) {
            organization = new SalesOrganization();
        } else if (type.getValue().equals(Type.Testing.getValue())) {
            organization = new TestingOrganization();
        }else if (type.getValue().equals(Type.Accouunts.getValue())) {
            organization = new AccountingOrganization();
        }

        if (organization != null) {
            organizationList.add(organization);
        }
        return organization;
    }
}
