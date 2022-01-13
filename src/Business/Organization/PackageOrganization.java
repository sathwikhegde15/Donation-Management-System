/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PackageRole;
import Business.Role.QualityCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pratik Gawand
 */
public class PackageOrganization extends Organization {

    public PackageOrganization() {
        super(Organization.Type.PackageOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PackageRole());
        return roles;
    }
}
