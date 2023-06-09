package jdbcgui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class StatsPatient extends javax.swing.JFrame {

    myDBCon dbCon;
    ResultSet rs;
    ResultSet rsdeptno;

    public StatsPatient() {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
        
        txtDiseaseList.setEditable(false);
        txtMedicineList.setEditable(false);
        
        dbCon = new myDBCon();
        getNewData();
    }

    private void getNewData() {

        try {

            rs = dbCon.executeStatement("SELECT id, name, gender, phonenum, TO_CHAR(birthdate, 'dd-Mon-yyyy') birthdate, hospital_id, doctor_ssn, TO_CHAR(admissiondate, 'dd-Mon-yyyy') admissiondate FROM patient ORDER BY id ASC ");
            
            rs.beforeFirst();
            rs.first();
            populateFields();
            
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected patient id.");
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
        lblName = new javax.swing.JLabel();
        lblDiseases = new javax.swing.JLabel();
        labelDiseaseCount = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        labelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiseaseList = new javax.swing.JTextArea();
        lblMedicines = new javax.swing.JLabel();
        labelMedicineCount = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMedicineList = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update/Delete Employee");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("View Patient Info");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName.setText("PATIENT NAME:");

        lblDiseases.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDiseases.setText("TOTAL DISEASES:");

        labelDiseaseCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDiseaseCount.setText("0");

        btnNext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelName.setText("name here");

        txtDiseaseList.setColumns(20);
        txtDiseaseList.setRows(5);
        jScrollPane1.setViewportView(txtDiseaseList);

        lblMedicines.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMedicines.setText("TOTAL MEDICINES:");

        labelMedicineCount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelMedicineCount.setText("0");

        txtMedicineList.setColumns(20);
        txtMedicineList.setRows(5);
        jScrollPane2.setViewportView(txtMedicineList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDiseases)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelDiseaseCount))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMedicines)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMedicineCount))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelName))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnPrevious)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(labelName))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblDiseases)
                                    .addComponent(labelDiseaseCount))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMedicines)
                                    .addComponent(labelMedicineCount))
                                .addGap(12, 12, 12)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateFields() {
        try {
            String field_id = rs.getString("id");
            
            // set name
            labelName.setText(rs.getString("name"));
            
            // get diseases count
            String SQL_totalDiseases = "SELECT COUNT(*) totalDiseases FROM infected_by WHERE patient_id = " + field_id;
            ResultSet rsDiseaseCount = dbCon.executeStatement(SQL_totalDiseases);
            rsDiseaseCount.next();
            int totalDiseases = rsDiseaseCount.getInt("totalDiseases");
            labelDiseaseCount.setText(String.valueOf(totalDiseases));
            
            // get list of diseases
            String SQL_listDiseases = "SELECT d.name name, d.severity severity FROM disease d, infected_by i WHERE i.disease_id = d.id AND i.patient_id = " + field_id;
            ResultSet rsDiseaseList = dbCon.executeStatement(SQL_listDiseases);
            String list_of_diseases = "";
            while (rsDiseaseList.next()) {
                list_of_diseases += rsDiseaseList.getString("name") + " \t" + rsDiseaseList.getString("severity") + "\n";
            }
            if (list_of_diseases.equals("")) {
                txtDiseaseList.setText("No diseases");
            } else {
                txtDiseaseList.setText("Name \tSeverity\n" + list_of_diseases);
            }
            
            
            // get medicine count
            String SQL_totalMedicines = "SELECT COUNT(*) totalMedicines FROM takes WHERE patient_id = " + field_id;
            ResultSet rsMedicineCount = dbCon.executeStatement(SQL_totalMedicines);
            rsMedicineCount.next();
            int totalMedicines = rsMedicineCount.getInt("totalMedicines");
            labelMedicineCount.setText(String.valueOf(totalMedicines));
            
            
            // get list of medicines
            String SQL_listMedicines = "SELECT m.name name FROM medicine m, takes t WHERE t.medicine_id = m.id AND t.patient_id = " + field_id;
            ResultSet rsMedicineList = dbCon.executeStatement(SQL_listMedicines);
            String list_of_medicines = "";
            while (rsMedicineList.next()) {
                list_of_medicines += rsMedicineList.getString("name") + "\n";
            }
            if (list_of_medicines.equals("")) {
                txtMedicineList.setText("No medicines");
            } else {
                txtMedicineList.setText("Name\n" + list_of_medicines);
            }
               
            
            rsDiseaseCount.close();
            rsDiseaseList.close();
            
            rsMedicineCount.close();
            rsMedicineList.close();
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(StatsPatient.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(StatsPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatsPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StatsPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDiseaseCount;
    private javax.swing.JLabel labelMedicineCount;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel lblDiseases;
    private javax.swing.JLabel lblMedicines;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextArea txtDiseaseList;
    private javax.swing.JTextArea txtMedicineList;
    // End of variables declaration//GEN-END:variables
}
