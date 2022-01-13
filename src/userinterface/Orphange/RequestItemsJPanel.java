/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Orphange;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Network.Network;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationRequest;
import Business.WorkQueue.Need;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author satwi
 */
public class RequestItemsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestItemsJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;

    public RequestItemsJPanel() {
        initComponents();
    }

    public RequestItemsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        lblEntepriseValue.setText(enterprise.getName());

        cmbFood.setEnabled(false);
        cmbClothes.setEnabled(false);
        cmbMedicalKits.setEnabled(false);
        cmbSchoolKits.setEnabled(false);
        cmbFruits.setEnabled(false);

        spinnerFood.setEnabled(false);
        spinnerClothes.setEnabled(false);
        spinnerFruits.setEnabled(false);
        spinnerMedicalKits.setEnabled(false);
        spinnerStationery.setEnabled(false);

        //btnReset.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEnterprise = new javax.swing.JLabel();
        lblEntepriseValue = new javax.swing.JLabel();
        chkFood = new javax.swing.JCheckBox();
        chkClothes = new javax.swing.JCheckBox();
        chkMedicalKits = new javax.swing.JCheckBox();
        chkSchoolKits = new javax.swing.JCheckBox();
        lblItemType = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        cmbFood = new javax.swing.JComboBox<>();
        cmbClothes = new javax.swing.JComboBox<>();
        cmbMedicalKits = new javax.swing.JComboBox<>();
        cmbSchoolKits = new javax.swing.JComboBox<>();
        lblComments = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cmbFruits = new javax.swing.JComboBox<>();
        chkFruits = new javax.swing.JCheckBox();
        spinnerFood = new javax.swing.JSpinner();
        spinnerClothes = new javax.swing.JSpinner();
        spinnerMedicalKits = new javax.swing.JSpinner();
        spinnerStationery = new javax.swing.JSpinner();
        spinnerFruits = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblEnterprise.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblEnterprise.setText("Enterprise");

        lblEntepriseValue.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        chkFood.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        chkFood.setText("Food");
        chkFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFoodActionPerformed(evt);
            }
        });

        chkClothes.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        chkClothes.setText("Clothes");
        chkClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkClothesActionPerformed(evt);
            }
        });

        chkMedicalKits.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        chkMedicalKits.setText("Medical Kits");
        chkMedicalKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMedicalKitsActionPerformed(evt);
            }
        });

        chkSchoolKits.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        chkSchoolKits.setText("School Kits");
        chkSchoolKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSchoolKitsActionPerformed(evt);
            }
        });

        lblItemType.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblItemType.setText("Item Type");

        lblQuantity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQuantity.setText("Quantity");

        lblProduct.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblProduct.setText("Product");

        tblSummary.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Type", "Product", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblSummary);

        cmbFood.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk", "Eggs", "Butter", "Chicken", "Turkey", "Ham" }));
        cmbFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFoodActionPerformed(evt);
            }
        });

        cmbClothes.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbClothes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jeans", "Shirts", "T-Shirt" }));
        cmbClothes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClothesActionPerformed(evt);
            }
        });

        cmbMedicalKits.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbMedicalKits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masks", "Santizer", "Face Shield" }));
        cmbMedicalKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicalKitsActionPerformed(evt);
            }
        });

        cmbSchoolKits.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbSchoolKits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Books", "Pen", "Pencil" }));
        cmbSchoolKits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSchoolKitsActionPerformed(evt);
            }
        });

        lblComments.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblComments.setText("Comments:");

        txtComments.setBackground(new java.awt.Color(204, 204, 204));
        txtComments.setMaximumSize(new java.awt.Dimension(50, 50));
        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(153, 153, 153));
        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(153, 153, 153));
        btnReset.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setAlignmentX(0.5F);
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cmbFruits.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        cmbFruits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kiwi", "Peach", "Apple" }));
        cmbFruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFruitsActionPerformed(evt);
            }
        });

        chkFruits.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        chkFruits.setText("Fruits");
        chkFruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFruitsActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/donate3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkFood, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbClothes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerFood, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEnterprise)
                        .addGap(34, 34, 34)
                        .addComponent(lblEntepriseValue, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(chkMedicalKits)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMedicalKits, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkSchoolKits)
                                    .addComponent(chkFruits, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbFruits, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSchoolKits, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerMedicalKits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerStationery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerFruits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblComments)
                .addGap(29, 29, 29)
                .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(462, 462, 462))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spinnerClothes, spinnerFood, spinnerFruits, spinnerMedicalKits, spinnerStationery});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chkClothes, chkFood, chkFruits, chkMedicalKits, chkSchoolKits});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbClothes, cmbFood, cmbFruits, cmbMedicalKits, cmbSchoolKits});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnterprise)
                            .addComponent(lblEntepriseValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblItemType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(chkFood)
                                .addComponent(spinnerFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbClothes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkClothes)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkMedicalKits)
                                    .addComponent(cmbMedicalKits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(cmbSchoolKits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(spinnerMedicalKits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(chkSchoolKits))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(spinnerStationery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerFruits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbFruits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(chkFruits)))
                        .addGap(23, 23, 23))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComments)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {spinnerClothes, spinnerFood, spinnerFruits, spinnerMedicalKits, spinnerStationery});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbClothes, cmbFood, cmbFruits, cmbMedicalKits, cmbSchoolKits});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chkClothes, chkFood, chkFruits, chkMedicalKits, chkSchoolKits});

    }// </editor-fold>//GEN-END:initComponents

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void cmbClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClothesActionPerformed
        // TODO add your handling code here:
        cmbClothes.setEnabled(true);
        spinnerClothes.setEnabled(true);
    }//GEN-LAST:event_cmbClothesActionPerformed

    private void cmbFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFoodActionPerformed
        // TODO add your handling code here:
        cmbFood.setEnabled(true);
        spinnerFood.setEnabled(true);

    }//GEN-LAST:event_cmbFoodActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrphanageDashboardJpanel odj = (OrphanageDashboardJpanel) component;
        odj.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        chkFood.setSelected(false);
        chkFruits.setSelected(false);
        chkClothes.setSelected(false);
        chkMedicalKits.setSelected(false);
        chkSchoolKits.setSelected(false);

        cmbFood.setEnabled(false);
        cmbClothes.setEnabled(false);
        cmbMedicalKits.setEnabled(false);
        cmbSchoolKits.setEnabled(false);
        cmbFruits.setEnabled(false);

        spinnerFood.setEnabled(false);
        spinnerClothes.setEnabled(false);
        spinnerFruits.setEnabled(false);
        spinnerMedicalKits.setEnabled(false);
        spinnerStationery.setEnabled(false);


    }//GEN-LAST:event_btnResetActionPerformed

    public void populateData(ArrayList<Need> needList) {

        DefaultTableModel model = (DefaultTableModel) tblSummary.getModel();

        model.setRowCount(0);

        for (Need n : needList) {
            Object row[] = new Object[3];
            row[0] = n;
            row[1] = n.getNeedName();
            row[2] = n.getQuantity();
            ((DefaultTableModel) tblSummary.getModel()).addRow(row);
        }
    }

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (!(chkClothes.isSelected()) && !(chkFood.isSelected()) && !(chkFruits.isSelected()) && !(chkMedicalKits.isSelected()) && !(chkSchoolKits.isSelected())) {

            JOptionPane.showMessageDialog(null, "Please Select Products!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String mess = txtComments.getText();
        if (mess.equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Please add comments", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //**************************************
        int check = 0;

        String message = txtComments.getText();

        ArrayList<Need> needList = new ArrayList<>();

        if (chkClothes.isSelected()) {

            if (spinnerClothes.getValue().equals(check)) {

                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Need n = new Need();
            n.setNeedName(String.valueOf(cmbClothes.getSelectedItem()));
            n.setNeedType("Clothes");
            n.setQuantity((Integer) spinnerClothes.getValue());
            needList.add(n);
            populateData(needList);
        }

        if (chkFood.isSelected()) {

            if (spinnerFood.getValue().equals(check)) {

                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Need n = new Need();
            n.setNeedName(String.valueOf(cmbFood.getSelectedItem()));
            n.setNeedType("Food");
            n.setQuantity((Integer) spinnerFood.getValue());
            needList.add(n);
            populateData(needList);
        }

        if (chkFruits.isSelected()) {

            if (spinnerFruits.getValue().equals(check)) {

                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Need n = new Need();
            n.setNeedName(String.valueOf(cmbFruits.getSelectedItem()));
            n.setNeedType("Fruits");
            n.setQuantity((Integer) spinnerFruits.getValue());
            needList.add(n);
            populateData(needList);
        }

        if (chkMedicalKits.isSelected()) {

            if (spinnerMedicalKits.getValue().equals(check)) {

                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Need n = new Need();
            n.setNeedName(String.valueOf(cmbMedicalKits.getSelectedItem()));
            n.setNeedType("Hygience");
            n.setQuantity((Integer) spinnerMedicalKits.getValue());
            needList.add(n);
            populateData(needList);
        }
        if (chkSchoolKits.isSelected()) {

            if (spinnerStationery.getValue().equals(check)) {

                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Need n = new Need();
            n.setNeedName(String.valueOf(cmbSchoolKits.getSelectedItem()));
            n.setNeedType("Stationery");
            n.setQuantity((Integer) spinnerStationery.getValue());
            needList.add(n);
            populateData(needList);
        }

        DonationRequest request = new DonationRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setNeedList(needList);

        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                e.setEnterpriseType(Enterprise.EnterpriseType.NGO);
                if (e instanceof NGOEnterprise) {
                    Organization org = null;
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof NGOOrganization) {
                            org = organization;
                            break;
                        }
                    }
                    if (org != null) {

                        org.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Request Initiated Successfully!");

        //Clearing the selected options
        chkClothes.setSelected(false);
        chkFood.setSelected(false);
        chkFruits.setSelected(false);
        chkMedicalKits.setSelected(false);
        chkSchoolKits.setSelected(false);

        cmbFood.setEnabled(false);
        cmbClothes.setEnabled(false);
        cmbMedicalKits.setEnabled(false);
        cmbSchoolKits.setEnabled(false);
        cmbFruits.setEnabled(false);

        spinnerFood.setEnabled(false);
        spinnerClothes.setEnabled(false);
        spinnerFruits.setEnabled(false);
        spinnerMedicalKits.setEnabled(false);
        spinnerStationery.setEnabled(false);

        btnReset.setEnabled(false);
        txtComments.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void chkFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFoodActionPerformed
        // TODO add your handling code here:
        cmbFood.setEnabled(true);
        spinnerFood.setEnabled(true);
    }//GEN-LAST:event_chkFoodActionPerformed

    private void cmbMedicalKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicalKitsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbMedicalKitsActionPerformed

    private void cmbSchoolKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSchoolKitsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbSchoolKitsActionPerformed

    private void cmbFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFruitsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbFruitsActionPerformed

    private void chkClothesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkClothesActionPerformed
        // TODO add your handling code here:
        cmbClothes.setEnabled(true);
        spinnerClothes.setEnabled(true);
    }//GEN-LAST:event_chkClothesActionPerformed

    private void chkMedicalKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMedicalKitsActionPerformed
        // TODO add your handling code here:
        cmbMedicalKits.setEnabled(true);
        spinnerMedicalKits.setEnabled(true);
    }//GEN-LAST:event_chkMedicalKitsActionPerformed

    private void chkSchoolKitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSchoolKitsActionPerformed
        // TODO add your handling code here:
        cmbSchoolKits.setEnabled(true);
        spinnerStationery.setEnabled(true);
    }//GEN-LAST:event_chkSchoolKitsActionPerformed

    private void chkFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFruitsActionPerformed
        // TODO add your handling code here:    
        cmbFruits.setEnabled(true);
        spinnerFruits.setEnabled(true);
    }//GEN-LAST:event_chkFruitsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkClothes;
    private javax.swing.JCheckBox chkFood;
    private javax.swing.JCheckBox chkFruits;
    private javax.swing.JCheckBox chkMedicalKits;
    private javax.swing.JCheckBox chkSchoolKits;
    private javax.swing.JComboBox<String> cmbClothes;
    private javax.swing.JComboBox<String> cmbFood;
    private javax.swing.JComboBox<String> cmbFruits;
    private javax.swing.JComboBox<String> cmbMedicalKits;
    private javax.swing.JComboBox<String> cmbSchoolKits;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblEntepriseValue;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblItemType;
    private javax.swing.JLabel lblProduct;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JSpinner spinnerClothes;
    private javax.swing.JSpinner spinnerFood;
    private javax.swing.JSpinner spinnerFruits;
    private javax.swing.JSpinner spinnerMedicalKits;
    private javax.swing.JSpinner spinnerStationery;
    private javax.swing.JTable tblSummary;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables
}