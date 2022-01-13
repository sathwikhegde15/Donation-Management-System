/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Pratik Gawand
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization generateOrganization(Organization.Type type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.NgoOrganization.getValue())) {
            organization = new NGOOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.OrphanageOrganization.getValue())) {
            organization = new OrphanageOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DistributorOrganization.getValue())) {
            organization = new DistributorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.QualityCheckOrganization.getValue())) {
            organization = new QualityOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DeliveryOrganization.getValue())) {
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.DonorOrganization.getValue())) {
            organization = new DonorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.PackageOrganization.getValue())) {
            organization = new PackageOrganization();
            organizationList.add(organization);
        }

        return organization;
    }

}
