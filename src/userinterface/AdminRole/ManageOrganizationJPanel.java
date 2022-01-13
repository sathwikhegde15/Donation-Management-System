/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdminRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author satwi
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;
    private Enterprise enterprise;

    private javax.swing.JComboBox organizationJComboBox;

    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();
    }

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblOrganization.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }

    }

    private void populateComboBox() {
        cmbOrganizationType.removeAllItems();
//
//        if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.Orphanage.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.OrphanageOrganization);
//        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.NGO.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.NgoOrganization);
//        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.QualityCheck.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.QualityCheckOrganization);
//        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.Distributor.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.DistributorOrganization);
//        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Delivery.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.DeliveryOrganization);
//        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType6.Donor.getValue())) {
//            cmbOrganizationType.addItem(Organization.Type.DonorOrganization);
//        }

        for (Organization.Type type : Organization.Type.values()) {

            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.Orphanage.getValue())) {
                if (type.getValue().equals(Organization.Type.OrphanageOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.NGO.getValue())) {
                if (type.getValue().equals(Organization.Type.NgoOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.QualityCheck.getValue())) {
                if (type.getValue().equals(Organization.Type.QualityCheckOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
                if (type.getValue().equals(Organization.Type.PackageOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.Distributor.getValue())) {
                if (type.getValue().equals(Organization.Type.DistributorOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Delivery.getValue())) {
                if (type.getValue().equals(Organization.Type.DeliveryOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType6.Donor.getValue())) {
                if (type.getValue().equals(Organization.Type.DonorOrganization.getValue())) {
                    cmbOrganizationType.addItem(type);
                }
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManagOrganization = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        lblEmpOrganization = new javax.swing.JLabel();
        cmbOrganizationType = new javax.swing.JComboBox();
        btnCreateOrg = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblOrganizationsList = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblManagOrganization.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblManagOrganization.setText("Manage Organization");

        tblOrganization.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(tblOrganization);

        lblEmpOrganization.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEmpOrganization.setText("Organization Type:");

        cmbOrganizationType.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        cmbOrganizationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganizationType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationTypeActionPerformed(evt);
            }
        });

        btnCreateOrg.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnCreateOrg.setText("Create Organization");
        btnCreateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrgActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationsList.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblOrganizationsList.setText("List of Organizations:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/organization2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrganizationsList)
                                .addGap(116, 116, 116)
                                .addComponent(lblManagOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(lblEmpOrganization)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCreateOrg)
                                .addGap(21, 21, 21)))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblOrganizationsList))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManagOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpOrganization)
                    .addComponent(cmbOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnCreateOrg)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrgActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) cmbOrganizationType.getSelectedItem();
        organizationDirectory.generateOrganization(type);
        populateTable();

        JOptionPane.showMessageDialog(null, "Organization added successfully!");
    }//GEN-LAST:event_btnCreateOrgActionPerformed

    private void cmbOrganizationTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationTypeActionPerformed
        // TODO add your handling code here:
//        cmbOrganizationType.removeAllItems();
//
//        for (Organization.Type type : Organization.Type.values()) {
//
//            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.Orphanage.getValue())) {
//                if (type.getValue().equals(Organization.Type.OrphanageOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.NGO.getValue())) {
//                if (type.getValue().equals(Organization.Type.NgoOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.QualityCheck.getValue())) {
//                if (type.getValue().equals(Organization.Type.QualityCheckOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//                if (type.getValue().equals(Organization.Type.PackageOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.Distributor.getValue())) {
//                if (type.getValue().equals(Organization.Type.DistributorOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Delivery.getValue())) {
//                if (type.getValue().equals(Organization.Type.DeliveryOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType6.Donor.getValue())) {
//                if (type.getValue().equals(Organization.Type.DonorOrganization.getValue())) {
//                    cmbOrganizationType.addItem(type);
//                }
//            }
//        }
    }//GEN-LAST:event_cmbOrganizationTypeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrg;
    private javax.swing.JComboBox cmbOrganizationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpOrganization;
    private javax.swing.JLabel lblManagOrganization;
    private javax.swing.JLabel lblOrganizationsList;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
