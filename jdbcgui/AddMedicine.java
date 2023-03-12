package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class AddMedicine extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;
    
    
    public AddMedicine() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 
        //this.setLocation(WIDTH, HEIGHT);
        // set all error labels to invisible
        lblMedError.setVisible(false);
        lblMedNameError.setVisible(false);
        dbCon = new myDBCon();
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
        jMedId = new javax.swing.JLabel();
        jMedName = new javax.swing.JLabel();
        txtMedName = new javax.swing.JTextField();
        btnAddNewEmp = new javax.swing.JButton();
        lblMedError = new javax.swing.JLabel();
        lblMedNameError = new javax.swing.JLabel();
        txtMedId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Medicine");

        jMedId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMedId.setText("ID:");

        jMedName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMedName.setText("Name:");

        txtMedName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMedName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedNameActionPerformed(evt);
            }
        });

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblMedError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblMedError.setForeground(new java.awt.Color(255, 0, 0));
        lblMedError.setText("error label");

        lblMedNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblMedNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblMedNameError.setText("error label");

        txtMedId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMedId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jMedId)
                    .addComponent(jMedName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedError, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnAddNewEmp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblMedNameError)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jMedId)
                            .addComponent(txtMedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedError))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMedName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(btnAddNewEmp)
                .addContainerGap(55, Short.MAX_VALUE))
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
        lblMedError.setText("");
        lblMedError.setVisible(false);
        lblMedNameError.setText("");
        lblMedNameError.setVisible(false);
    }

    private boolean isDuplicate(int id) throws SQLException {
        // check if patient id already exists
        String stmtSQL = "SELECT id FROM patient WHERE id = " + id;
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }
    
    // validate all user entry before sending new employee details to DB
    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        
        if(txtMedId.getText().trim().isEmpty()) {
            lblMedError.setText("Cannot be empty");
            lblMedError.setVisible(true);
            result = false;
        } else {
            try {
                int field_id_INT = Integer.parseInt(txtMedId.getText().trim());

                if (field_id_INT > 99999) {
                    lblMedError.setText("Cannot exceed 5 chars");
                    lblMedError.setVisible(true);
                    result = false;
                }
                if (field_id_INT < 0) {
                    lblMedError.setText("Cannot be negative");
                    lblMedError.setVisible(true);
                    result = false;
                }
                if (isDuplicate(field_id_INT)) {
                    lblMedError.setText("Patient already exists");
                    lblMedError.setVisible(true);
                    result = false;
                }
            }
            catch (SQLException e) {
                lblMedError.setText("SQL ERROR");
                lblMedError.setVisible(true);
                result = false;
            }
            catch (NumberFormatException e) {
                lblMedError.setText("Must be an integer");
                lblMedError.setVisible(true);
                result = false;
            }
        }
        if (txtMedName.getText().trim().isEmpty() || (txtMedName.getText().trim().length() > 20)) {
            if (txtMedName.getText().trim().isEmpty()) {
                lblMedNameError.setText("Invalid. Cannot be empty.");
            } else if ((txtMedName.getText().trim().length() > 10)) {
               lblMedNameError.setText("Invalid. Must be < 30 chars.");
            }
            lblMedNameError.setVisible(true);
            result = false;
        }

        

        return result;
    }

    void clearInputBoxes() { // clear for every new entry 
        txtMedName.setText("");
        txtMedId.setText("");
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
                String prepSQL = "INSERT INTO medicine (id, name) VALUES ("
                        + "'" +txtMedId.getText().trim() + "'" + ", "
                        + "'" + txtMedName.getText().toUpperCase() + "') ";

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New Medicine added successfully.");
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
            JOptionPane.showMessageDialog(null, "Error adding new medicine.");
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtMedNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedNameActionPerformed

    private void txtMedIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedIdActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMedId;
    private javax.swing.JLabel jMedName;
    private javax.swing.JLabel lblMedError;
    private javax.swing.JLabel lblMedNameError;
    private javax.swing.JTextField txtMedId;
    private javax.swing.JTextField txtMedName;
    // End of variables declaration//GEN-END:variables
}
