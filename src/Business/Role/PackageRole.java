/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PackageOrganization;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Package.PackageDashboardJPanel;

/**
 *
 * @author Pratik Gawand
 */
public class PackageRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PackageDashboardJPanel(userProcessContainer, account, (PackageOrganization) organization, enterprise, business);
    }

}
