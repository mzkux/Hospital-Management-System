package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jdbcgui.UpdateDeleteEmployee.txtSSN;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */

public class UpdateDeleteDoctor extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    ResultSet rsdeptno;

    /**
     * Creates new form AddEmployee
     */
    public UpdateDeleteDoctor() {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        
        // set all error labels to invisible
        lblSpecializatoinError.setVisible(false);
        lblQualificationError.setVisible(false);
        dbCon = new myDBCon();
        cmbQualification.addItem("NONE");
        cmbQualification.addItem("MBBS");
        cmbQualification.addItem("MD");
        cmbQualification.addItem("DO");
        cmbQualification.addItem("BMBS");
        cmbQualification.addItem("MBChB");
        cmbQualification.addItem("MBBCh");
        cmbQualification.addItem("B.Med");
        cmbQualification.addItem("MB");
        cmbQualification.addItem("BM");
        cmbQualification.addItem("B.S");
        cmbQualification.addItem("B.Surg");
        cmbQualification.addItem("Dr.MuD");
        cmbQualification.addItem("Dr.Med");
        cmbQualification.addItem("DPM");
        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {

            // populate mgr field
//            rs = statement.executeQuery("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp ORDER BY empno ASC ");
            
            String statement;
            statement = "SELECT qualification, specialization FROM Doctor where ssn = " + txtSSN.getText().trim();
            System.out.print(statement);
            //rs = dbCon.executeStatement("SELECT ssn, qualification, specialization FROM Doctor ORDER BY ssn ASC ");
            rs = dbCon.executeStatement(statement);
            // populate rest of fields
            rs.beforeFirst();
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected SSN.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
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
        jSpecializatoin = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        lblSpecializatoinError = new javax.swing.JLabel();
        jQualification = new javax.swing.JLabel();
        cmbQualification = new javax.swing.JComboBox<>();
        lblQualificationError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update/Delete Doctor");

        jSpecializatoin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpecializatoin.setText("Specialization:");

        txtSpecialization.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        lblSpecializatoinError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblSpecializatoinError.setForeground(new java.awt.Color(255, 0, 0));
        lblSpecializatoinError.setText("error label");

        jQualification.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jQualification.setText("Qualification:");

        cmbQualification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQualificationActionPerformed(evt);
            }
        });

        lblQualificationError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblQualificationError.setForeground(new java.awt.Color(255, 0, 0));
        lblQualificationError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jQualification)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblQualificationError, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpecializatoin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSpecializatoinError, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpecializatoin)
                        .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSpecializatoinError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQualificationError)
                    .addComponent(cmbQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQualification))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields() {
        try {
            if(rs.next()) {
            cmbQualification.setSelectedItem(rs.getString("qualification"));
            txtSpecialization.setText(rs.getString("specialization"));
            }
            else {
            cmbQualification.setSelectedItem("NONE");
            txtSpecialization.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    void clearErrorLabels() {
        lblSpecializatoinError.setText("");
        lblSpecializatoinError.setVisible(false);
        lblQualificationError.setText("");
        lblQualificationError.setVisible(false);
    }

    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    boolean isValidData() {
        clearErrorLabels();
        boolean result = true; // assume all details are true, set to false if otherwise 
        // you need to check format deails and make sure they are consistent with DB 
        

        if (txtSpecialization.getText().trim().isEmpty() || (txtSpecialization.getText().trim().length() > 20)) {
            if (txtSpecialization.getText().trim().isEmpty()) {
                lblSpecializatoinError.setText("Invalid. Cannot be empty.");
            } else if ((txtSpecialization.getText().trim().length() > 10)) {
                lblSpecializatoinError.setText("Invalid. Must be < 30 chars.");
            }
            lblSpecializatoinError.setVisible(true);
            result = false;
        }

        

        return result;
    }

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed

    private void cmbQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbQualificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> cmbQualification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jQualification;
    private javax.swing.JLabel jSpecializatoin;
    private javax.swing.JLabel lblQualificationError;
    private javax.swing.JLabel lblSpecializatoinError;
    public static javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables
}
