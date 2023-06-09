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
 * @author wissam
 */
public class UpdateDeleteLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;

    ResultSet rs;
    ResultSet rsusertype;
    LoginUser loggedUser;

    public UpdateDeleteLoginUser(LoginUser user) {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
      
        // set all error labels to invisible
        lblNameError.setVisible(false);
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
      
        // connect to db and get user data and populate form fields
        dbCon = new myDBCon();
        getNewData();
        loggedUser = user;
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
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        btnUpdateUser = new javax.swing.JButton();
        lblUsernameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnDeleteUser = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnTogglePassword = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Login User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Update Login User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Confirm Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Type:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Name:");

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserTypeActionPerformed(evt);
            }
        });

        btnUpdateUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUpdateUser.setText("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        lblUsernameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblUsernameError.setForeground(new java.awt.Color(255, 0, 0));
        lblUsernameError.setText("error label");

        lblConfirmPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblConfirmPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmPasswordError.setText("error label");

        lblPasswordError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblPasswordError.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordError.setText("error label");

        lblNameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText("error label");

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConfirmPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btnDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDeleteUser.setText("Delete");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

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

        btnTogglePassword.setText("SHOW PASSWORD");
        btnTogglePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTogglePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrevious)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(txtConfirmPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTogglePassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdateUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(205, 205, 205))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsernameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasswordError)
                    .addComponent(btnTogglePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmPasswordError))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnDeleteUser)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getNewData() {
        // get all user data and populate fields 
        try {
            
            // populate type field
            rsusertype = dbCon.executeStatement("SELECT type, description FROM usertype ORDER BY type ASC ");
            cmbUserType.removeAllItems();
            while (rsusertype.next()) {
                cmbUserType.addItem(rsusertype.getString("description"));
            }
            
            // populate rest of fields
            //rs = dbCon.executeStatement("SELECT username, password, name, type FROM loginusers");
            rs = dbCon.executeStatement("SELECT username, name, type FROM loginusers");
            rs.beforeFirst();
            rs.first();
            
            populateFields();
        } catch (SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected empno.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void populateFields() {
        // populate fields with the current user details 
        try {
            txtUsername.setText(rs.getString("username"));
            txtName.setText(rs.getString("name"));
            
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtPassword.setEchoChar('*');
            txtConfirmPassword.setEchoChar('*');
            btnTogglePassword.setSelected(false);
            
//            cmbUserType.setSelectedItem(rs.getInt("type")); // todo: fix
            rsusertype.beforeFirst();
            int type = rs.getInt("type");
            while (rsusertype.next()) {
                if (rsusertype.getInt("type") == type) {
                cmbUserType.setSelectedItem(rsusertype.getString("description"));
                    break;
                }
            }

            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void EnableDisableButtons() {
        // enable/disable Previous/Next buttons
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
            Logger.getLogger(UpdateDeleteLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void clearErrorLabels() {
        // clear all error labels and set their visibility to false 
        lblNameError.setText("");
        lblNameError.setVisible(false);
        lblUsernameError.setText("");
        lblUsernameError.setVisible(false);
        lblPasswordError.setText("");
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setText("");
        lblConfirmPasswordError.setVisible(false);
    }

    boolean isValidPassword() {
        // check validity of new password in case of update 
        boolean result = false;
        
        if (txtPassword.getText().equals(txtConfirmPassword.getText()))
            result = true;
        
        return result;
    }

    boolean isValidData() {
        // check validity of entered data before update 
        clearErrorLabels();
        boolean result = true;
        
        if (txtName.getText().trim().isEmpty()) {
            lblNameError.setText("Invalid. Cannot be empty.");
            lblNameError.setVisible(true);
            result = false;
        }
        
        if(txtPassword.getText().length() < 3) {
            lblPasswordError.setText("Minimum 3 characters");
            lblPasswordError.setVisible(true);
            result = false;
        }
        
        if(txtPassword.getText().length() > 50) {
            lblPasswordError.setText("Maximum 50 characters");
            lblPasswordError.setVisible(true);
            result = false;
        }
        
        if (!isValidPassword()) {
            lblConfirmPasswordError.setText("Invalid. Passwords do not match.");
            lblConfirmPasswordError.setVisible(true);
            result = false;
        }
        
        return result;
    }

    void clearInputBoxes() {
        //Clear The text boxes
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        cmbUserType.setSelectedIndex(0);
    }

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
        // verify input data
        // verify that new user does not currently exist 
        
        try {
            if (isValidData()) {
                int userType = 1;
                String userPassword;

                // hash password
                try {
                    userPassword = PasswordEncryption.hashPassword(txtPassword.getText().trim());
                    System.out.println("Password before: '" + txtPassword.getText().trim() + "'");
                    System.out.println("Password after:  '" + userPassword + "'");
                }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Password hashing failed" + e.getMessage());
                    return;
                }
                
                // confirmation dialog
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to update '" + txtName.getText().trim() + "'?") != 0) {
                    JOptionPane.showMessageDialog(null, "Cancelled update");
                    return;
                } 

                // get selected userType
                rsusertype.beforeFirst();
                String typeDesc = (String)cmbUserType.getSelectedItem();
                while (rsusertype.next()) {
                    if (rsusertype.getString("description").equals(typeDesc)) {
                        userType = rsusertype.getInt("type");
                        break;
                    }
                }

                String prepSQL = "UPDATE loginusers SET "
                        + "name = '" + txtName.getText().trim() + "', "
                        + "type = " + userType + ", "
                        + "password = '" + userPassword + "' "
                        + "WHERE username = '" + txtUsername.getText().trim() + "'";
                
                System.out.println("[UPDATE SQL]: " + prepSQL);
                
                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {
                    javax.swing.JLabel label = new javax.swing.JLabel("User '" + txtName.getText().trim() + "' updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    getNewData();
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update user");
                    getNewData();
                }
                
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error updating user." + e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // shows confirmation dialog then deletes based on response
        
        // prevent deletion of currently logged in user
        if (loggedUser.username.equals(txtUsername.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Cannot delete the currently logged in user!");
            return;
        }
        
        // confirmation dialog
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete '" + txtName.getText().trim() + "'?") != 0) {
            JOptionPane.showMessageDialog(null, "Cancelled deletion.");
            return;
        } 
        
        try {
            // make the result set scrolable forward/backward updatable
            String prepSQL = "DELETE loginusers WHERE name = '" + txtName.getText().trim() + "'";
            
            System.out.println("[DELETE SQL]: " + prepSQL);
            
            int result = dbCon.executePrepared(prepSQL);
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("User '" + txtName.getText().trim() + "' deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error deleting user.");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void MoveNext() {
        // move result set to next record
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void MovePrevious() {
        // move result set to next record
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDeleteLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void cmbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserTypeActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnTogglePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTogglePasswordActionPerformed
        // TODO add your handling code here:
        if (btnTogglePassword.isSelected()) {
            txtPassword.setEchoChar((char)0);
            txtConfirmPassword.setEchoChar((char)0);
        }
        else {
            // hide password
            txtPassword.setEchoChar('*');
            txtConfirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_btnTogglePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JToggleButton btnTogglePassword;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblConfirmPasswordError;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPasswordError;
    private javax.swing.JLabel lblUsernameError;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
