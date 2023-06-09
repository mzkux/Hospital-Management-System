package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static jdbcgui.AddEmployee.txtSSN;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class AddSecretary extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;

    public AddSecretary() {
        initComponents();
        //this.setLocationRelativeTo(null); // center form in screen 
        this.setLocation(WIDTH, HEIGHT);
        // set all error labels to invisible
        dbCon = new myDBCon();
        lblTypingSpeedError.setVisible(false);

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
        jTypingSpeed = new javax.swing.JLabel();
        txtTypingSpeed = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        lblTypingSpeedError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Secretary");

        jTypingSpeed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTypingSpeed.setText("Typing Speed:");

        txtTypingSpeed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTypingSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypingSpeedActionPerformed(evt);
            }
        });

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblTypingSpeedError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblTypingSpeedError.setForeground(new java.awt.Color(255, 0, 0));
        lblTypingSpeedError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jTypingSpeed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTypingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTypingSpeedError, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnAddNewEmp)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTypingSpeed)
                    .addComponent(txtTypingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTypingSpeedError))
                .addGap(18, 18, 18)
                .addComponent(btnAddNewEmp)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // verify valid entry of integer values
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    // verify valid entry of double values
    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    void clearErrorLabels() { // clear all labels used to display error messages 
        lblTypingSpeedError.setText("");
        lblTypingSpeedError.setVisible(false);
    }

    // validate all user entry before sending new employee details to DB
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        

        if (txtTypingSpeed.getText().trim().isEmpty() || (txtTypingSpeed.getText().trim().length() > 10)) {
            if (txtTypingSpeed.getText().trim().isEmpty()) {
                lblTypingSpeedError.setText("Invalid. Cannot be empty.");
            } else if ((txtTypingSpeed.getText().trim().length() > 10)) {
                lblTypingSpeedError.setText("Invalid. Must be < 10 chars.");
            }
            lblTypingSpeedError.setVisible(true);
            result = false;
        }

        

        

        return result;
    }

    void clearInputBoxes() { // clear for every new entry 
        txtSSN.setText("");
        txtTypingSpeed.setText("");
    }

    
    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:

        try {
            /*
                * you need also to verify that the empno is unique and not duplicate 
                  
                *
             */
            if (isValidData()) {
                // if new employee details are valid, then add new employee to DB

                String prepSQL = "INSERT INTO secretary (ssn, typingspeed) VALUES ("
                        + txtSSN.getText().trim() + ", "
                        + txtTypingSpeed.getText().toUpperCase() + ") ";

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New secretary added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                } else {

                }

            } else {
                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtTypingSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypingSpeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypingSpeedActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jTypingSpeed;
    private javax.swing.JLabel lblTypingSpeedError;
    private javax.swing.JTextField txtTypingSpeed;
    // End of variables declaration//GEN-END:variables
}
