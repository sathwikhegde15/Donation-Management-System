/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratik Gawand
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
   

    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateNetworkTable();
        /*
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("https://storage.googleapis.com/proudcity/sanrafaelca/uploads/2020/04/donate-image.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        jLabel2.setIcon(imageIcon);
        */
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network.getName();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblManageNetwork = new javax.swing.JLabel();
        lblThumbsUp = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJTable.setBorder(new javax.swing.border.MatteBorder(null));
        networkJTable.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 453, 108));

        lblName.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 83, -1));

        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 107, -1));

        btnBack.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 94, -1));

        lblManageNetwork.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        lblManageNetwork.setText("Manage Network");
        add(lblManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 216, -1));

        lblThumbsUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/yes.png"))); // NOI18N
        lblThumbsUp.setText("jLabel3");
        add(lblThumbsUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 295, 157));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/network.png"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1440, 133));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        String netName = txtName.getText();

        if (netName.equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Network Name Cannot Be Empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String name = txtName.getText();

        Network network = ecosystem.createAndAddNetwork();
        network.setName(name);

        populateNetworkTable();
        JOptionPane.showMessageDialog(null, "Network Added Successfully!");
        txtName.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblManageNetwork;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblThumbsUp;
    private javax.swing.JTable networkJTable;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
