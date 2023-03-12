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
 * @author USER01
 */
public class AddPatient extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;

    public AddPatient() {
        initComponents();
        this.setLocationRelativeTo(null); // center form in screen 
        // set all error labels to invisible
        lblErrorId.setVisible(false);
        lblErrorName.setVisible(false);
        lblErrorGender.setVisible(false);
        lblErrorPhone.setVisible(false);
        lblErrorBirthDate.setVisible(false);
        lblErrorHospitalID.setVisible(false);
        lblErrorDoctorSSN.setVisible(false);
        lblErrorAdmissionDate.setVisible(false);

        dbCon = new myDBCon();
            
        try {
            //populate combo boxes 
            
            // populate gender combo box
            cmbGender.addItem("M");
            cmbGender.addItem("F");

            // populate doctor ssn combobox
            rs = dbCon.executeStatement("SELECT ssn FROM doctor ORDER BY ssn ASC");
            while (rs.next()) {
                cmbDoctorSSN.addItem(rs.getString("ssn"));
            }
            
            // populate hospital id combobox
            rs = dbCon.executeStatement("SELECT id FROM hospital ORDER BY id ASC");
            while (rs.next()) {
                cmbHospitalID.addItem(rs.getString("id"));
            }
            
            // put current date in admission date by default
            txtAdmissionDate.setText(getCurrentDate());
            
            rs.close();
            
        } catch (SQLException e) {
            System.out.println(e);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBirthDate = new javax.swing.JTextField();
        txtAdmissionDate = new javax.swing.JTextField();
        cmbDoctorSSN = new javax.swing.JComboBox<>();
        cmbHospitalID = new javax.swing.JComboBox<>();
        btnAddNewEmp = new javax.swing.JButton();
        lblErrorId = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblErrorBirthDate = new javax.swing.JLabel();
        lblErrorHospitalID = new javax.swing.JLabel();
        lblErrorDoctorSSN = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        lblErrorGender = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorAdmissionDate = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Patient");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Birth Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Hospital ID:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Doctor SSN:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Admission Date:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtBirthDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAdmissionDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbDoctorSSN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbDoctorSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorSSNActionPerformed(evt);
            }
        });

        cmbHospitalID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        lblErrorId.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorId.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorId.setText("error label");

        lblErrorName.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorName.setText("error label");

        lblErrorBirthDate.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorBirthDate.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorBirthDate.setText("error label");

        lblErrorHospitalID.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorHospitalID.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorHospitalID.setText("error label");

        lblErrorDoctorSSN.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorDoctorSSN.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorDoctorSSN.setText("error label");

        cmbGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGenderActionPerformed(evt);
            }
        });

        lblErrorGender.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorGender.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorGender.setText("error label");

        lblErrorPhone.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPhone.setText("error label");

        lblErrorAdmissionDate.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblErrorAdmissionDate.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorAdmissionDate.setText("error label");

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblErrorPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnAddNewEmp)
                                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                .addComponent(txtBirthDate))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblErrorName, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                .addComponent(lblErrorBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblErrorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(lblErrorGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblErrorHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbDoctorSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblErrorDoctorSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAdmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblErrorAdmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE)))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblErrorPhone))
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorBirthDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblErrorHospitalID)
                    .addComponent(cmbHospitalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblErrorDoctorSSN)
                    .addComponent(cmbDoctorSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtAdmissionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorAdmissionDate))
                .addGap(21, 21, 21)
                .addComponent(btnAddNewEmp)
                .addGap(0, 36, Short.MAX_VALUE))
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

    // clear all labels used to display error messages 
    void clearErrorLabels() { 
        lblErrorId.setText("");
        lblErrorId.setVisible(false);
        lblErrorName.setText("");
        lblErrorName.setVisible(false);
        lblErrorGender.setText("");
        lblErrorGender.setVisible(false);
        lblErrorPhone.setText("");
        lblErrorPhone.setVisible(false);
        lblErrorBirthDate.setText("");
        lblErrorBirthDate.setVisible(false);
        lblErrorHospitalID.setText("");
        lblErrorHospitalID.setVisible(false);
        lblErrorDoctorSSN.setText("");
        lblErrorDoctorSSN.setVisible(false);
        lblErrorAdmissionDate.setText("");
        lblErrorAdmissionDate.setVisible(false);
    }

    // validate all user entry before sending new patient details to DB
    boolean isValidData() throws SQLException {
        clearErrorLabels();
        boolean result = true; 
        
        String field_id = txtId.getText().trim();
        String field_name = txtName.getText().trim();
        String field_gender = cmbGender.getSelectedItem().toString();
        String field_phonenum = txtPhone.getText().trim();
        String field_birthdate = txtBirthDate.getText().trim();
        String field_hospital_id = cmbHospitalID.getSelectedItem().toString();
        String field_doctor_ssn = cmbDoctorSSN.getSelectedItem().toString();
        String field_admissiondate = txtAdmissionDate.getText().trim();
        
        if (field_id.isEmpty()) {
            lblErrorId.setText("Cannot be empty");
            lblErrorId.setVisible(true);
            result = false;
        } else {
            try {
                int field_id_INT = Integer.parseInt(field_id);

                if (field_id_INT > 99999) {
                    lblErrorId.setText("Cannot exceed 5 chars");
                    lblErrorId.setVisible(true);
                    result = false;
                }
                if (field_id_INT < 0) {
                    lblErrorId.setText("Cannot be negative");
                    lblErrorId.setVisible(true);
                    result = false;
                }
                if (isDuplicate(field_id_INT)) {
                    lblErrorId.setText("Patient already exists");
                    lblErrorId.setVisible(true);
                    result = false;
                }
            }
            catch (SQLException e) {
                lblErrorId.setText("SQL ERROR");
                lblErrorId.setVisible(true);
                result = false;
            }
            catch (NumberFormatException e) {
                lblErrorId.setText("Must be an integer");
                lblErrorId.setVisible(true);
                result = false;
            }
        }
        
        if (field_name.length() > 30) {
            lblErrorName.setText("Cannot exceed 30 chars");
            lblErrorName.setVisible(true);
            result = false;
        }
        if (field_name.isEmpty()) {
            lblErrorName.setText("Cannot be empty");
            lblErrorName.setVisible(true);
            result = false;
        }
        
        if (field_phonenum.isEmpty()) {
            lblErrorPhone.setText("Cannot be empty");
            lblErrorPhone.setVisible(true);
            result = false;
        }
        if (!isValidPhoneNumber(field_phonenum)) {
            lblErrorPhone.setText("Format is ###-###-####");
            lblErrorPhone.setVisible(true);
            result = false;
        }
        
        if (!isValidDate(field_birthdate)) {
            lblErrorBirthDate.setText("Format must be dd-MMM-yyyy");
            lblErrorBirthDate.setVisible(true);
            result = false;
        }
        if (field_birthdate.isEmpty()) {
            lblErrorBirthDate.setText("Cannot be empty");
            lblErrorBirthDate.setVisible(true);
            result = false;
        }
        
        if (!isValidDate(field_admissiondate)) {
            lblErrorAdmissionDate.setText("Format must be dd-MMM-yyyy");
            lblErrorAdmissionDate.setVisible(true);
            result = false;
        }
        if (field_admissiondate.isEmpty()) {
            lblErrorAdmissionDate.setText("Cannot be empty");
            lblErrorAdmissionDate.setVisible(true);
            result = false;
        }

        return result;
    }

    // clear for every new entry 
    void clearInputBoxes() { 
        txtId.setText("");
        txtName.setText("");
        cmbGender.setSelectedIndex(0);
        txtPhone.setText("");
        txtBirthDate.setText("");
        cmbHospitalID.setSelectedIndex(0);
        cmbDoctorSSN.setSelectedIndex(0);
        txtAdmissionDate.setText(getCurrentDate());
    }

    private boolean isDuplicate(int id) throws SQLException {
        // check if patient id already exists
        String stmtSQL = "SELECT id FROM patient WHERE id = " + id;
        rs = dbCon.executeStatement(stmtSQL);
        return rs.isBeforeFirst();
    }
    
    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:

        try {
            if (isValidData()) {
                String field_id = txtId.getText().trim();
                String field_name = txtName.getText().trim();
                String field_gender = cmbGender.getSelectedItem().toString();
                String field_phonenum = txtPhone.getText().trim();
                String field_birthdate = txtBirthDate.getText().trim();
                String field_hospital_id = cmbHospitalID.getSelectedItem().toString();
                String field_doctor_ssn = cmbDoctorSSN.getSelectedItem().toString();
                String field_admissiondate = txtAdmissionDate.getText().trim();

                String prepSQL = "INSERT INTO patient (id, name, gender, phonenum, birthdate, hospital_id, doctor_ssn, admissiondate) VALUES ("
                        + "" + field_id + ", "
                        + "'" + field_name + "', "
                        + "'" + field_gender + "', "
                        + "'" + field_phonenum + "', "
                        + "'" + field_birthdate + "', "
                        + "'" + field_hospital_id + "', "
                        + "" + field_doctor_ssn + ", "
                        + "'" + field_admissiondate + "' "
                        + ")";
                System.out.println("[INSERT Patient] " + prepSQL);

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("New patient added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }

                rs.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new patient.");
        }
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void cmbDoctorSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoctorSSNActionPerformed

    private void cmbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGenderActionPerformed

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
    
    public static boolean isValidPhoneNumber(String phone_number) {
        return phone_number.matches("\\d{3}-\\d{3}-\\d{4}");
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JComboBox<String> cmbDoctorSSN;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbHospitalID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblErrorAdmissionDate;
    private javax.swing.JLabel lblErrorBirthDate;
    private javax.swing.JLabel lblErrorDoctorSSN;
    private javax.swing.JLabel lblErrorGender;
    private javax.swing.JLabel lblErrorHospitalID;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JTextField txtAdmissionDate;
    private javax.swing.JTextField txtBirthDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
