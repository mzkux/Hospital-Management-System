package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class AddDisease extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;

    public AddDisease() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 
        // set all error labels to invisible
        lblErrorId.setVisible(false);
        lblErrorName.setVisible(false);
        lblErrorDisease.setVisible(false);

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
        lblId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSeverity = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSeverity = new javax.swing.JTextField();
        btnAddNewDisease = new javax.swing.JButton();
        lblErrorId = new javax.swing.JLabel();
        lblErrorDisease = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Disease");

        lblId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblId.setText("ID:");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setText("NAME:");

        lblSeverity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSeverity.setText("SEVERITY:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtSeverity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSeverity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeverityActionPerformed(evt);
            }
        });

        btnAddNewDisease.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewDisease.setText("Add New");
        btnAddNewDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewDiseaseActionPerformed(evt);
            }
        });

        lblErrorId.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorId.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorId.setText("error label");

        lblErrorDisease.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorDisease.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorDisease.setText("error label");

        lblErrorName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorName.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblId)
                            .addComponent(lblSeverity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddNewDisease)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtSeverity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(lblErrorDisease, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeverity)
                    .addComponent(txtSeverity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorDisease))
                .addGap(18, 18, 18)
                .addComponent(btnAddNewDisease)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeverityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeverityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeverityActionPerformed

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
        lblErrorId.setText("");
        lblErrorId.setVisible(false);
        lblErrorName.setText("");
        lblErrorName.setVisible(false);
        lblErrorDisease.setText("");
        lblErrorDisease.setVisible(false);
    }

    // validate all user entry before sending new employee details to DB
    boolean isValidData() throws SQLException {
        clearErrorLabels();
        boolean result = true;
        
        String field_id = txtId.getText().trim();
        String field_name = txtName.getText().trim();
        String field_severity = txtSeverity.getText().trim();
        
        if (field_id.length() > 5) {
            lblErrorId.setText("Cannot exceed 5 chars");
            lblErrorId.setVisible(true);
            result = false;
        }
        
        if (!isInteger(field_id)) {
            lblErrorId.setText("Must be an integer");
            lblErrorId.setVisible(true);
            result = false;
        }
        
        if (field_id.isEmpty()) {
            lblErrorId.setText("Cannot be empty");
            lblErrorId.setVisible(true);
            result = false;
        }
        
        if (isDuplicate(field_id)) {
            lblErrorId.setText("Disease already exists");
            lblErrorId.setVisible(true);
            result = false;
        }
        
        if (field_name.isEmpty()) {
            lblErrorName.setText("Cannot be empty");
            lblErrorName.setVisible(true);
            result = false;
        }
        
        if (field_name.length() > 30) {
            lblErrorName.setText("Cannot exceed 30 chars");
            lblErrorName.setVisible(true);
            result = false;
        }
        
        if (field_severity.isEmpty()) {
            lblErrorDisease.setText("Cannot be empty");
            lblErrorDisease.setVisible(true);
            result = false;
        }
        
        if (field_severity.length() > 15) {
            lblErrorDisease.setText("Cannot exceed 30 chars");
            lblErrorDisease.setVisible(true);
            result = false;
        }
        
        return result;
    }

    void clearInputBoxes() { // clear for every new entry 
        txtId.setText("");
        txtName.setText("");
        txtSeverity.setText("");
    }

    private boolean isDuplicate(String id) throws SQLException {
        // check if disease id already exists
        String stmtSQL = "SELECT id FROM disease WHERE id = '" + id + "'";
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }
    private void btnAddNewDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewDiseaseActionPerformed
        // TODO add your handling code here:

        try {
            if (isValidData()) {
                String field_id = txtId.getText().trim();
                String field_name = txtName.getText().trim();
                String field_severity = txtSeverity.getText().trim();

                String prepSQL = "INSERT INTO disease (id, name, severity) VALUES ("
                        + "'" + field_id + "', "
                        + "'" + field_name + "', "
                        + "'" + field_severity + "')";
                System.out.println("[INSERT Disease] " + prepSQL);

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("New disease added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }

                rs.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new disease.");
        }
    }//GEN-LAST:event_btnAddNewDiseaseActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar calendar = Calendar.getInstance();
        
        return dateFormat.format(calendar.getTime());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewDisease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrorDisease;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSeverity;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeverity;
    // End of variables declaration//GEN-END:variables
}
