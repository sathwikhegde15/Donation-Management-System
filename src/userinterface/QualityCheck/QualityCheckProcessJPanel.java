/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.QualityCheck;

import Business.WorkQueue.DonationRequest;
import Business.WorkQueue.Need;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratik Gawand
 */
public class QualityCheckProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QualityCheckProcessJPanel
     */
    private JPanel userProcessContainer;
    private DonationRequest request;

    public QualityCheckProcessJPanel(JPanel userProcessContainer, DonationRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        groupButton();
        populateTable();
        resultJTextField.setEnabled(false);
        resultJTextField.setText("AWAITING RESULT ");
        finalProgressBar.setEnabled(false);
        pbChemicalBar.setEnabled(false);
        pbNutritionBar.setEnabled(false);
        pbSpoilageBar.setEnabled(false);
        pbMicrobioBar.setEnabled(false);
        qualityCheckReport.setEditable(false);
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);

        ArrayList<Need> needList = ((DonationRequest) request).getNeedList();
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

    private void groupButton() {

        ButtonGroup buttonGrp1 = new ButtonGroup();
        buttonGrp1.add(radioBtnQ1Yes);
        buttonGrp1.add(radioBtnQ1No);

        ButtonGroup buttonGrp2 = new ButtonGroup();
        buttonGrp2.add(radioBtnQ2Yes);
        buttonGrp2.add(radioBtnQ2No);

        ButtonGroup buttonGrp3 = new ButtonGroup();
        buttonGrp3.add(radioBtnQ3Yes);
        buttonGrp3.add(radioBtnQ3No);

        ButtonGroup buttonGrp4 = new ButtonGroup();
        buttonGrp4.add(radioBtnQ4Yes);
        buttonGrp4.add(radioBtnQ4No);

        ButtonGroup buttonGrp5 = new ButtonGroup();
        buttonGrp5.add(radioQ5Yes);
        buttonGrp5.add(radioBtnQ5No);

        ButtonGroup buttonGrp6 = new ButtonGroup();
        buttonGrp6.add(radioBtnQ6Yes);
        buttonGrp6.add(radioBtnQ6No);

        ButtonGroup buttonGrp7 = new ButtonGroup();
        buttonGrp7.add(radioQ7Yes);
        buttonGrp7.add(radioQ7No);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        radioBtnQ1Yes = new javax.swing.JRadioButton();
        radioBtnQ1No = new javax.swing.JRadioButton();
        radioBtnQ3Yes = new javax.swing.JRadioButton();
        radioBtnQ2Yes = new javax.swing.JRadioButton();
        radioBtnQ3No = new javax.swing.JRadioButton();
        radioBtnQ2No = new javax.swing.JRadioButton();
        lblQno2 = new javax.swing.JLabel();
        lblQno1 = new javax.swing.JLabel();
        lblQno3 = new javax.swing.JLabel();
        radioBtnQ4No = new javax.swing.JRadioButton();
        radioBtnQ4Yes = new javax.swing.JRadioButton();
        lblQno4 = new javax.swing.JLabel();
        radioQ5Yes = new javax.swing.JRadioButton();
        lblQno7 = new javax.swing.JLabel();
        radioBtnQ5No = new javax.swing.JRadioButton();
        radioBtnQ6Yes = new javax.swing.JRadioButton();
        lblQno5 = new javax.swing.JLabel();
        radioBtnQ6No = new javax.swing.JRadioButton();
        lblQno6 = new javax.swing.JLabel();
        radioQ7Yes = new javax.swing.JRadioButton();
        radioQ7No = new javax.swing.JRadioButton();
        resultJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        finalProgressBar = new javax.swing.JProgressBar();
        pbChemicalBar = new javax.swing.JProgressBar();
        pbNutritionBar = new javax.swing.JProgressBar();
        pbMicrobioBar = new javax.swing.JProgressBar();
        pbSpoilageBar = new javax.swing.JProgressBar();
        lblTest2 = new javax.swing.JLabel();
        lblTest1 = new javax.swing.JLabel();
        lblTest3 = new javax.swing.JLabel();
        lblTest4 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        qualityCheckReport = new javax.swing.JTextArea();
        btnGenerateReport = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(null);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(1240, 10, 55, 21);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1);
        jLabel1.setBounds(19, 29, 80, 23);

        tblProducts.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Product", "Quantity"
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

        add(jScrollPane2);
        jScrollPane2.setBounds(680, 130, 610, 75);

        radioBtnQ1Yes.setText("YES");
        radioBtnQ1Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ1YesActionPerformed(evt);
            }
        });
        add(radioBtnQ1Yes);
        radioBtnQ1Yes.setBounds(360, 130, 50, 21);

        radioBtnQ1No.setText("NO");
        radioBtnQ1No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ1NoActionPerformed(evt);
            }
        });
        add(radioBtnQ1No);
        radioBtnQ1No.setBounds(430, 130, 42, 21);

        radioBtnQ3Yes.setText("YES");
        radioBtnQ3Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ3YesActionPerformed(evt);
            }
        });
        add(radioBtnQ3Yes);
        radioBtnQ3Yes.setBounds(360, 210, 50, 21);

        radioBtnQ2Yes.setText("YES");
        radioBtnQ2Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ2YesActionPerformed(evt);
            }
        });
        add(radioBtnQ2Yes);
        radioBtnQ2Yes.setBounds(360, 170, 50, 21);

        radioBtnQ3No.setText("NO");
        radioBtnQ3No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ3NoActionPerformed(evt);
            }
        });
        add(radioBtnQ3No);
        radioBtnQ3No.setBounds(430, 210, 42, 21);

        radioBtnQ2No.setText("NO");
        radioBtnQ2No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ2NoActionPerformed(evt);
            }
        });
        add(radioBtnQ2No);
        radioBtnQ2No.setBounds(430, 170, 42, 21);

        lblQno2.setBackground(new java.awt.Color(0, 0, 0));
        lblQno2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno2.setText("Are all products free from Food Adulteration? ");
        add(lblQno2);
        lblQno2.setBounds(19, 162, 400, 18);

        lblQno1.setBackground(new java.awt.Color(0, 0, 0));
        lblQno1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno1.setText("Are the products within the expiry date? ");
        add(lblQno1);
        lblQno1.setBounds(19, 122, 250, 18);

        lblQno3.setBackground(new java.awt.Color(0, 0, 0));
        lblQno3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno3.setText("Are all products free from Pathogens? ");
        add(lblQno3);
        lblQno3.setBounds(19, 202, 390, 18);

        radioBtnQ4No.setText("NO");
        radioBtnQ4No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ4NoActionPerformed(evt);
            }
        });
        add(radioBtnQ4No);
        radioBtnQ4No.setBounds(430, 250, 42, 21);

        radioBtnQ4Yes.setText("YES");
        radioBtnQ4Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ4YesActionPerformed(evt);
            }
        });
        add(radioBtnQ4Yes);
        radioBtnQ4Yes.setBounds(360, 250, 50, 21);

        lblQno4.setBackground(new java.awt.Color(0, 0, 0));
        lblQno4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno4.setText("Are all products free from contaminants? ");
        add(lblQno4);
        lblQno4.setBounds(19, 242, 390, 18);

        radioQ5Yes.setText("YES");
        radioQ5Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQ5YesActionPerformed(evt);
            }
        });
        add(radioQ5Yes);
        radioQ5Yes.setBounds(360, 340, 50, 21);

        lblQno7.setBackground(new java.awt.Color(0, 0, 0));
        lblQno7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno7.setText("Are all products free from Process Generated chemical? ");
        add(lblQno7);
        lblQno7.setBounds(20, 340, 370, 18);

        radioBtnQ5No.setText("NO");
        radioBtnQ5No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ5NoActionPerformed(evt);
            }
        });
        add(radioBtnQ5No);
        radioBtnQ5No.setBounds(430, 340, 42, 21);

        radioBtnQ6Yes.setText("YES");
        radioBtnQ6Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ6YesActionPerformed(evt);
            }
        });
        add(radioBtnQ6Yes);
        radioBtnQ6Yes.setBounds(360, 280, 50, 21);

        lblQno5.setBackground(new java.awt.Color(0, 0, 0));
        lblQno5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno5.setText("Are all products free from Spoilage Indicator? ");
        add(lblQno5);
        lblQno5.setBounds(20, 270, 390, 18);

        radioBtnQ6No.setText("NO");
        radioBtnQ6No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnQ6NoActionPerformed(evt);
            }
        });
        add(radioBtnQ6No);
        radioBtnQ6No.setBounds(430, 280, 42, 21);

        lblQno6.setBackground(new java.awt.Color(0, 0, 0));
        lblQno6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblQno6.setText("Are the product sanitized?");
        add(lblQno6);
        lblQno6.setBounds(20, 310, 235, 18);

        radioQ7Yes.setText("YES");
        radioQ7Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQ7YesActionPerformed(evt);
            }
        });
        add(radioQ7Yes);
        radioQ7Yes.setBounds(360, 310, 50, 21);

        radioQ7No.setText("NO");
        radioQ7No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQ7NoActionPerformed(evt);
            }
        });
        add(radioQ7No);
        radioQ7No.setBounds(430, 310, 42, 21);

        resultJTextField.setBackground(new java.awt.Color(51, 255, 0));
        resultJTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resultJTextField.setForeground(new java.awt.Color(102, 204, 0));
        add(resultJTextField);
        resultJTextField.setBounds(19, 58, 235, 28);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("FINAL RESULT");
        add(jLabel3);
        jLabel3.setBounds(19, 489, 100, 18);

        finalProgressBar.setBackground(new java.awt.Color(102, 255, 102));
        finalProgressBar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        finalProgressBar.setForeground(new java.awt.Color(102, 204, 0));
        finalProgressBar.setStringPainted(true);
        add(finalProgressBar);
        finalProgressBar.setBounds(195, 490, 427, 27);

        pbChemicalBar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        pbChemicalBar.setOpaque(true);
        pbChemicalBar.setStringPainted(true);
        add(pbChemicalBar);
        pbChemicalBar.setBounds(195, 438, 89, 18);

        pbNutritionBar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        pbNutritionBar.setStringPainted(true);
        add(pbNutritionBar);
        pbNutritionBar.setBounds(549, 438, 73, 18);

        pbMicrobioBar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        pbMicrobioBar.setStringPainted(true);
        add(pbMicrobioBar);
        pbMicrobioBar.setBounds(549, 454, 73, 18);

        pbSpoilageBar.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        pbSpoilageBar.setStringPainted(true);
        add(pbSpoilageBar);
        pbSpoilageBar.setBounds(195, 456, 89, 18);

        lblTest2.setBackground(new java.awt.Color(0, 0, 0));
        lblTest2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTest2.setText("NUTRITIONAL TEST  ");
        add(lblTest2);
        lblTest2.setBounds(366, 438, 130, 18);

        lblTest1.setBackground(new java.awt.Color(0, 0, 0));
        lblTest1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTest1.setText("CHEMICAL TEST  ");
        add(lblTest1);
        lblTest1.setBounds(19, 438, 150, 18);

        lblTest3.setBackground(new java.awt.Color(0, 0, 0));
        lblTest3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTest3.setText("SPOILAGE INDICATOR TEST");
        add(lblTest3);
        lblTest3.setBounds(19, 459, 170, 18);

        lblTest4.setBackground(new java.awt.Color(0, 0, 0));
        lblTest4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTest4.setText("MICROBIOLOGICAL TEST ");
        add(lblTest4);
        lblTest4.setBounds(363, 459, 160, 18);

        btnReset.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        add(btnReset);
        btnReset.setBounds(410, 530, 120, 27);

        btnSubmit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(270, 530, 120, 27);

        qualityCheckReport.setColumns(20);
        qualityCheckReport.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        qualityCheckReport.setRows(5);
        jScrollPane1.setViewportView(qualityCheckReport);

        add(jScrollPane1);
        jScrollPane1.setBounds(680, 220, 610, 290);

        btnGenerateReport.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnGenerateReport.setText("Generate Summarized Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });
        add(btnGenerateReport);
        btnGenerateReport.setBounds(760, 530, 210, 27);

        btnSave.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSave.setText("Download Report");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(1000, 530, 210, 27);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/qualitycheck2.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(480, 130, 200, 230);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Resources/enterprise3_1_50.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(720, 10, 510, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        QualityCheckDashboardJpanel qcdj = (QualityCheckDashboardJpanel) component;
        qcdj.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radioBtnQ1YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ1YesActionPerformed
        // TODO add your handling code here:

        int value = 15;
        int internalvalue = 10;

        finalProgressBar.setEnabled(true);
        pbChemicalBar.setEnabled(true);
        pbNutritionBar.setEnabled(true);
        pbSpoilageBar.setEnabled(true);
        pbMicrobioBar.setEnabled(true);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(internalvalue);
        pbNutritionBar.setValue(internalvalue);
        finalProgressBar.setValue(internalvalue);
    }//GEN-LAST:event_radioBtnQ1YesActionPerformed

    private void radioBtnQ1NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ1NoActionPerformed
        // TODO add your handling code here:
        int value = 0;

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);
    }//GEN-LAST:event_radioBtnQ1NoActionPerformed

    private void radioBtnQ3YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ3YesActionPerformed
        // TODO add your handling code here:

        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);

        int internalvalue = 100;
        pbMicrobioBar.setValue(internalvalue);
    }//GEN-LAST:event_radioBtnQ3YesActionPerformed

    private void radioBtnQ2YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ2YesActionPerformed
        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);
        int internalvalue = 50;
        pbChemicalBar.setValue(internalvalue);
        pbNutritionBar.setValue(internalvalue);
    }//GEN-LAST:event_radioBtnQ2YesActionPerformed

    private void radioBtnQ3NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ3NoActionPerformed
        // TODO add your handling code here:
        int value = 0;

        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

    }//GEN-LAST:event_radioBtnQ3NoActionPerformed

    private void radioBtnQ2NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ2NoActionPerformed

        int value = 0;
        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

    }//GEN-LAST:event_radioBtnQ2NoActionPerformed

    private void radioBtnQ4NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ4NoActionPerformed
        // TODO add your handling code here:
        int value = 0;
        //   int internalvalue=10;

        // finalProgressBar.setEnabled(true);
        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

    }//GEN-LAST:event_radioBtnQ4NoActionPerformed

    private void radioBtnQ4YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ4YesActionPerformed
        // TODO add your handling code here:

        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);
        int internalvalue = 70;
        pbChemicalBar.setValue(internalvalue);
    }//GEN-LAST:event_radioBtnQ4YesActionPerformed

    private void radioQ5YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQ5YesActionPerformed
        // TODO add your handling code here:
        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);

        int internalvalue = 100;
        pbChemicalBar.setValue(internalvalue);

    }//GEN-LAST:event_radioQ5YesActionPerformed

    private void radioBtnQ5NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ5NoActionPerformed
        int value = 0;
        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

    }//GEN-LAST:event_radioBtnQ5NoActionPerformed

    private void radioBtnQ6YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ6YesActionPerformed
        // TODO add your handling code here:

        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);
        int internalvalue = 100;
        pbSpoilageBar.setValue(internalvalue);
    }//GEN-LAST:event_radioBtnQ6YesActionPerformed

    private void radioBtnQ6NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnQ6NoActionPerformed
        // TODO add your handling code here:
        int value = 0;
        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);
        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);


    }//GEN-LAST:event_radioBtnQ6NoActionPerformed

    private void radioQ7YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQ7YesActionPerformed
        // TODO add your handling code here:

        if (radioBtnQ1Yes.isSelected() && radioBtnQ2Yes.isSelected() && radioBtnQ3Yes.isSelected() && radioBtnQ4Yes.isSelected()
                && radioQ5Yes.isSelected() && radioBtnQ6Yes.isSelected() && radioQ7Yes.isSelected()) {
            resultJTextField.setText("QUALIFIED");

        }
        int currentvalue = finalProgressBar.getValue();
        int newvalue = currentvalue + 15;
        finalProgressBar.setValue(newvalue);
        finalProgressBar.setStringPainted(true);
        finalProgressBar.setForeground(Color.green);
        finalProgressBar.setBackground(Color.green);
        finalProgressBar.setString("100% QUALIFIED ");
        int internalvalue = 100;
        pbNutritionBar.setValue(internalvalue);
    }//GEN-LAST:event_radioQ7YesActionPerformed

    private void radioQ7NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQ7NoActionPerformed
        // TODO add your handling code here:
        int value = 0;
        resultJTextField.setText("NOT QUALIFIED ");
        // finalProgressBar.setEnabled(true);
        finalProgressBar.setBackground(Color.green);
        pbChemicalBar.setBackground(Color.green);
        pbNutritionBar.setBackground(Color.green);
        pbSpoilageBar.setBackground(Color.green);
        pbMicrobioBar.setBackground(Color.green);

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

    }//GEN-LAST:event_radioQ7NoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        int value = 0;

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(radioBtnQ1Yes);
        bg1.add(radioBtnQ1No);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(radioBtnQ2Yes);
        bg2.add(radioBtnQ2No);

        ButtonGroup bg3 = new ButtonGroup();
        bg3.add(radioBtnQ3Yes);
        bg3.add(radioBtnQ3No);

        ButtonGroup bg4 = new ButtonGroup();
        bg4.add(radioBtnQ4Yes);
        bg4.add(radioBtnQ4No);

        ButtonGroup bg5 = new ButtonGroup();
        bg5.add(radioQ5Yes);
        bg5.add(radioBtnQ5No);

        ButtonGroup bg6 = new ButtonGroup();
        bg6.add(radioBtnQ6Yes);
        bg6.add(radioBtnQ6No);

        ButtonGroup bg7 = new ButtonGroup();
        bg7.add(radioQ7Yes);
        bg7.add(radioQ7No);

        bg1.clearSelection();
        bg2.clearSelection();
        bg3.clearSelection();
        bg4.clearSelection();
        bg5.clearSelection();
        bg6.clearSelection();
        bg7.clearSelection();

        finalProgressBar.setValue(value);
        pbChemicalBar.setValue(value);
        pbNutritionBar.setValue(value);
        pbMicrobioBar.setValue(value);
        pbSpoilageBar.setValue(value);

        btnGenerateReport.setEnabled(true);
        resultJTextField.setText("AWAITING RESULT");
        qualityCheckReport.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        request.setStatus(resultJTextField.getText());
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Food Request Approved for Quality Check!");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed

        btnGenerateReport.setEnabled(false);
        String radioText1 = null;
        String radioText2 = null;
        String radioText3 = null;
        String radioText4 = null;
        String radioText5 = null;
        String radioText6 = null;
        String radioText7 = null;

        if (radioBtnQ1Yes.isSelected()) {
            radioText1 = "Yes";
        }
        if (radioBtnQ1No.isSelected()) {
            radioText1 = "No";
        }

        if (radioBtnQ2Yes.isSelected()) {
            radioText2 = "Yes";
        }
        if (radioBtnQ2No.isSelected()) {
            radioText2 = "No";
        }

        if (radioBtnQ3Yes.isSelected()) {
            radioText3 = "Yes";
        }
        if (radioBtnQ3No.isSelected()) {
            radioText3 = "No";
        }

        if (radioBtnQ4Yes.isSelected()) {
            radioText4 = "Yes";
        }
        if (radioBtnQ4No.isSelected()) {
            radioText4 = "No";
        }

        if (radioQ5Yes.isSelected()) {
            radioText5 = "Yes";
        }
        if (radioBtnQ5No.isSelected()) {
            radioText5 = "No";
        }

        if (radioBtnQ6Yes.isSelected()) {
            radioText6 = "Yes";
        }
        if (radioBtnQ6No.isSelected()) {
            radioText6 = "No";
        }

        if (radioQ7Yes.isSelected()) {
            radioText7 = "Yes";
        }
        if (radioQ7No.isSelected()) {
            radioText7 = "No";
        }
        //************************ End of radio button values

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        qualityCheckReport.append("\t\t QUALITY CHECK REPORT \n"
                + "\n Date of Quality Check : " + now + "\tResult :" + resultJTextField.getText()
                + "\n------------------------------------------------------------------------------------------------------------------------------"
                + "\n1) Are the products within the expiry date ? : " + radioText1 + "\n"
                + "\n2) Are all products free from Food Adulteration ? :" + radioText2 + "\n"
                + "\n3) Are all products free from Pathogens ? :" + radioText3 + "\n"
                + "\n4) Are all products free from contaminants ? :" + radioText4 + "\n"
                + "\n5) Are all products free from Process Generated chemical ? :" + radioText5 + "\n"
                + "\n6) Are all products free from Spoilage Indicator? :" + radioText6 + "\n"
                + "\n7) Are all products sanitized? :" + radioText7 + "\n"
                + "--------------------------------------------------------------------------------------------------------------------------------"
        );
        qualityCheckReport.setFont(new Font("Serif", Font.ITALIC, 16));

        btnGenerateReport.setEnabled(false);

    }//GEN-LAST:event_btnGenerateReportActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {

            Boolean ppt = qualityCheckReport.print();
            if (ppt) {
                JOptionPane.showMessageDialog(null, "Done");

            } else {
                JOptionPane.showMessageDialog(null, "Printing");
            }
        } catch (PrinterException ex) {
            Logger.getLogger(QualityCheckProcessJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JProgressBar finalProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQno1;
    private javax.swing.JLabel lblQno2;
    private javax.swing.JLabel lblQno3;
    private javax.swing.JLabel lblQno4;
    private javax.swing.JLabel lblQno5;
    private javax.swing.JLabel lblQno6;
    private javax.swing.JLabel lblQno7;
    private javax.swing.JLabel lblTest1;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JLabel lblTest3;
    private javax.swing.JLabel lblTest4;
    private javax.swing.JProgressBar pbChemicalBar;
    private javax.swing.JProgressBar pbMicrobioBar;
    private javax.swing.JProgressBar pbNutritionBar;
    private javax.swing.JProgressBar pbSpoilageBar;
    private javax.swing.JTextArea qualityCheckReport;
    private javax.swing.JRadioButton radioBtnQ1No;
    private javax.swing.JRadioButton radioBtnQ1Yes;
    private javax.swing.JRadioButton radioBtnQ2No;
    private javax.swing.JRadioButton radioBtnQ2Yes;
    private javax.swing.JRadioButton radioBtnQ3No;
    private javax.swing.JRadioButton radioBtnQ3Yes;
    private javax.swing.JRadioButton radioBtnQ4No;
    private javax.swing.JRadioButton radioBtnQ4Yes;
    private javax.swing.JRadioButton radioBtnQ5No;
    private javax.swing.JRadioButton radioBtnQ6No;
    private javax.swing.JRadioButton radioBtnQ6Yes;
    private javax.swing.JRadioButton radioQ5Yes;
    private javax.swing.JRadioButton radioQ7No;
    private javax.swing.JRadioButton radioQ7Yes;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTable tblProducts;
    // End of variables declaration//GEN-END:variables
}
