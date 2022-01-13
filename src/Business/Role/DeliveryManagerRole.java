/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.DeliveryOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Delivery.DeliveryManDashboardJpanel;
import userinterface.Delivery.DeliveryManagerDashboardJPanel;

/**
 *
 * @author Pratik Gawand
 */
public class DeliveryManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryManagerDashboardJPanel(userProcessContainer, account, (DeliveryOrganization) organization, enterprise, business);
    }

}
