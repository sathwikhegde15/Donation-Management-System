/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Distributor;

import Business.EcoSystem;
import Business.Enterprise.DeliveryEnterprise;
import Business.Enterprise.DonorEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonatedProduct;
import Business.WorkQueue.DonatedProductWarehouse;
import Business.WorkQueue.DonationRequest;
import Business.WorkQueue.Need;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Pratik Gawand
 */
public class ProcessDisturbutorDonationRequest extends javax.swing.JPanel {

    /**
     * Creates new form ProcessDisturbutorDonationRequest
     */
    private JPanel userProcessContainer;
    private DonationRequest request;
    private ArrayList<DonatedProduct> donatedProductsList;
    private ArrayList<Need> needList;
    UserAccount userAccount;
    boolean flag1 = false;
    EcoSystem ecosystem;
    Boolean flagFood;
    Enterprise enterprise;
    HashMap<String, Integer> requiredProdMap = new HashMap<>();

    public ProcessDisturbutorDonationRequest(JPanel userProcessContainer, UserAccount userAccount, DonationRequest request, Boolean flag, HashMap<String, Integer> requiredProdMap, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        needList = request.getNeedList();
        this.flagFood = flag;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.requiredProdMap = requiredProdMap;

        if (flagFood == true) {
            btnSubmit.setEnabled(true);
            btnSupplierFood.setEnabled(false);

        } else {
            btnSubmit.setEnabled(false);
            btnSupplierFood.setEnabled(true);

        }
        populateTable();

        populateInventory();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);

        needList = ((DonationRequest) request).getNeedList();
        if (needList != null) {
            for (Need n : needList) {
                Object row[] = new Object[3];
                row[0] = n;
                row[1] = n.getNeedName();
                row[2] = n.getQuantity();
                model.addRow(row);
            }
        }
    }

    private void populateInventory() {

        donatedProductsList = DonatedProductWarehouse.getDonatedProductList();
        DefaultTableModel model1 = (DefaultTableModel) tblInventory.getModel();
        model1.setRowCount(0);
        for (DonatedProduct dp : donatedProductsList) {
            Object row[] = new Object[5];
            row[0] = dp;
            row[1] = dp.getProductType();
            row[2] = dp.getProductName();
            row[3] = dp.getAvailability();
            row[4] = dp.getQuantity();

            model1.addRow(row);

        }
        Set<String> set = new HashSet<String>();
        for (DonatedProduct c : DonatedProductWarehouse.getDonatedProductList()) {
            set.add(c.getProductType());
        }
        cmbProductType.removeAllItems();

        for (String a : set) {
            cmbProductType.addItem(a);
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

        jLabel1 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblInventoryCount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbProductType = new javax.swing.JComboBox<>();
        btnProductType = new javax.swing.JButton();
        btnInventoryCount = new javax.swing.JButton();
        btnSupplierFood = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setText("Comments");

        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmit.setText("Approve NGO Request");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setText("Process Request");

        tblProducts.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Type", "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProducts);

        tblInventory.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Type", "Product Name", "Availablility ", "Units"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("Inventory Dashboard");

        lblInventoryCount.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblInventoryCount.setForeground(new java.awt.Color(255, 255, 255));
        lblInventoryCount.setText("0");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Filter");

        cmbProductType.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        cmbProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnProductType.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnProductType.setText("Product Type");
        btnProductType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductTypeActionPerformed(evt);
            }
        });

        btnInventoryCount.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnInventoryCount.setText("Inventory Count");
        btnInventoryCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryCountActionPerformed(evt);
            }
        });

        btnSupplierFood.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSupplierFood.setText("Request Donor");
        btnSupplierFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierFoodActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/donation-compress-image.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnSupplierFood)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInventoryCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(255, 255, 255))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnInventoryCount, btnProductType, cmbProductType});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnSubmit)
                            .addComponent(btnSupplierFood))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSubmit, btnSupplierFood});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnInventoryCount, btnProductType, cmbProductType});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorDashboardJpanel ddj = (DistributorDashboardJpanel) component;
        ddj.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        txtResult.setText("Approved");
        request.setStatus(txtResult.getText());
        request.setStatus("Completed");

        int suppCount = 0, reqCount = 0, newresult = 0;

        for (DonatedProduct inSupp : DonatedProductWarehouse.getDonatedProductList()) {
            for (Need n : needList) {
                if (n.getNeedName().equalsIgnoreCase(inSupp.getProductName())) {
                    if (n.getQuantity() < inSupp.getQuantity()) {
                        suppCount = inSupp.getQuantity();
                        reqCount = n.getQuantity();
                        newresult = suppCount - reqCount;
                        inSupp.setQuantity(newresult);

                    }

                }
            }
        }
        // InventoryDirectory.setInventoryList(inventoryList);
        JOptionPane.showMessageDialog(null, "Request Approved Successfully!");
        populateInventory();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnProductTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductTypeActionPerformed

        ArrayList<DonatedProduct> dps = new ArrayList<>();

        for (DonatedProduct dp : DonatedProductWarehouse.getDonatedProductList()) {

            if (dp.getProductType().equalsIgnoreCase((String) this.cmbProductType.getSelectedItem())) {
                dps.add(dp);
            }
        }
        if (dps.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        }

        DefaultTableModel dtm = (DefaultTableModel) tblInventory.getModel();
        dtm.setRowCount(0);

        for (DonatedProduct p : dps) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getProductType();
            row[2] = p.getProductName();
            row[3] = p.getAvailability();
            row[4] = p.getQuantity();

            dtm.addRow(row);

        }
    }//GEN-LAST:event_btnProductTypeActionPerformed

    private void btnInventoryCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryCountActionPerformed

        int counter = 0;
        for (DonatedProduct i : donatedProductsList) {

            counter = counter + i.getQuantity();

        }

        lblInventoryCount.setText(Integer.toString(counter));

    }//GEN-LAST:event_btnInventoryCountActionPerformed

    private void btnSupplierFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierFoodActionPerformed
        // TODO add your handling code here:
        Organization orgSupp = null;
        ArrayList<Need> needListSupp = new ArrayList<>();
        for (String str : requiredProdMap.keySet()) {
            Need n = new Need();
            n.setNeedName(str);
            n.setQuantity(requiredProdMap.get(str));
            needListSupp.add(n);

        }
        request.setSender(userAccount);
        if (request.getReceiver() == userAccount) {
            request.setReceiver(null);
        }
        request.setStatus("Pending Approval from Donor");
        request.setNeedList(needList);
        request.setRecievedNeedsList(needListSupp);

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise entp : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (entp instanceof DonorEnterprise) {
                    for (Organization org : entp.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof DonorOrganization) {
                            org.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Request Sent to Supplier!");

    }//GEN-LAST:event_btnSupplierFoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInventoryCount;
    private javax.swing.JButton btnProductType;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSupplierFood;
    private javax.swing.JComboBox<String> cmbProductType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInventoryCount;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}