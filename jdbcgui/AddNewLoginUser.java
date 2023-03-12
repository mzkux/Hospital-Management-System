package jdbcgui;

import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import static javax.net.ssl.SSLEngineResult.Status.OK;
import javax.swing.JOptionPane;
import jdbcgui.PasswordEncryption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wissam
 */
public class AddNewLoginUser extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    myDBCon dbCon;
    ResultSet rs;

    public AddNewLoginUser() {
        initComponents();
        
        // center form in screen 
        this.setLocationRelativeTo(null);
      
        // set all error labels to invisible
        lblUsernameError.setVisible(false);
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setVisible(false);

        // populate the user type combo box
        try {
            //populate type combo box
            dbCon = new myDBCon();
            rs = dbCon.executeStatement("SELECT description FROM usertype ORDER BY type ASC");
            // populate mgr combo box
            while (rs.next()) {
                cmbUserType.addItem(rs.getString("description"));
            }
            
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
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        btnAddNewEmp = new javax.swing.JButton();
        lblUsernameError = new javax.swing.JLabel();
        lblConfirmPasswordError = new javax.swing.JLabel();
        lblPasswordError = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Login User");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Add New Login User");

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

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbUserType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserTypeActionPerformed(evt);
            }
        });

        btnAddNewEmp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAddNewEmp.setText("Add New");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
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
        txtConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPasswordActionPerformed(evt);
            }
        });

        jToggleButton1.setText("SHOW");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddNewEmp)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword)
                            .addComponent(txtConfirmPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                .addComponent(lblUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPasswordError, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblConfirmPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
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
                    .addComponent(jToggleButton1))
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
                .addComponent(btnAddNewEmp)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void clearErrorLabels() {
        // erase error label text and set visibility to false 
        lblUsernameError.setText("");
        lblUsernameError.setVisible(false);
        lblPasswordError.setText("");
        lblPasswordError.setVisible(false);
        lblConfirmPasswordError.setText("");
        lblConfirmPasswordError.setVisible(false);
        lblNameError.setText("");
        lblNameError.setVisible(false);
    }

    boolean isValidPassword() {
        // check validity of the password value entered by the user based on your design 
        boolean result = true; //assume all details are true, set to false if otherwise  
        if(txtPassword.getText().trim().length() < 3 || txtPassword.getText().trim().length() > 50) {
            lblPasswordError.setText("Password should between 3 and 50 chars");
            lblPasswordError.setVisible(true);
            result = false;
        }
        else if (txtPassword.getText().trim().contentEquals(txtUsername.getText())) {
            lblPasswordError.setText("Password can't match username");
            lblPasswordError.setVisible(true);
            result = false;
        }
        else if (txtPassword.getText().trim().isEmpty()) {
            lblPasswordError.setText("Invalid. Cannot be empty.");
            lblPasswordError.setVisible(true);
            result = false;
        }
                      
        return result;
    }

    boolean isValidData() {
        // check validity of all values entered 
        
        clearErrorLabels();
        
        boolean result = true;
        
        if (!isValidPassword()) {
            result = false;
        }
        
        try {
            if (isDuplicate(txtUsername.getText().trim())) {
                result = false;
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error validating data.");
            return false;
        }
        
        if (txtUsername.getText().trim().isEmpty() || txtUsername.getText().length() > 25) {
            if (txtUsername.getText().trim().isEmpty()) {
                lblUsernameError.setText("Invalid. Cannot be empty.");
            } else if (txtUsername.getText().length() > 25) {
                lblUsernameError.setText("Invalid. Must be less than 25 characters");
            }
            lblUsernameError.setVisible(true);
            result = false;
        }
        if (!(txtPassword.getText().trim().contentEquals(txtConfirmPassword.getText().trim()))) {
            if (txtConfirmPassword.getText().trim().isEmpty())
                lblConfirmPasswordError.setText("Invalid. Cannot be empty.");
            else 
                lblConfirmPasswordError.setText("Passwords do not match");
            lblConfirmPasswordError.setVisible(true);
            result = false;
        }
        if (txtName.getText().length() > 25) {
            lblNameError.setText("Cannot exceed 25 characters.");
            lblNameError.setVisible(true);
            result = false;           
        }
        
        
        return result;
    }

    void clearInputBoxes() {
        // clear all text boxes and set the user type combo to the default value 
        txtPassword.setText("");
        txtUsername.setText("");
        txtName.setText("");
        txtConfirmPassword.setText("");
    }
   
    private boolean isDuplicate(String username) throws SQLException {
        //Check if a current user has the same username
        boolean isduplicate = true;
        String stmtSQL;
        stmtSQL = String.format("SELECT Username FROM loginusers WHERE Username = '%s'", username);
        rs = dbCon.executeStatement(stmtSQL);
        // isBeforeFirst() returns false if there are no data in the resultset
        isduplicate = rs.isBeforeFirst();
        if(isduplicate) {
            lblUsernameError.setText("User already exists");
            lblUsernameError.setVisible(true);
            isduplicate = false;
        }
        return isduplicate;
    }
    
    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        // TODO add your handling code here:
        try {
            
            
            //hash password
            String password = txtPassword.getText().trim();
            String confirmpassword = txtConfirmPassword.getText().trim();
            String hashedPassword = PasswordEncryption.hashPassword(password);
            int usertype = 0;
            if (cmbUserType.getSelectedItem().toString().matches("Administrator"))
                usertype = 0;
            else if (cmbUserType.getSelectedItem().toString().matches("Normal"))
                usertype = 1;

            if (isValidData()) {
                // if new employee details are valid, then add new employee to DB

                String prepSQL = "INSERT INTO loginusers (Name, Username, Password, type) VALUES ('"
                        + txtName.getText().trim() + "', "
                        + "'" + txtUsername.getText() + "', "
                        + "'" + hashedPassword + "', "
                        + usertype + ")";

                System.out.println("[ADD USER] " + prepSQL);

                int result = dbCon.executePrepared(prepSQL);
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New login user added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clearInputBoxes();
                }
                rs.close();
            } else {
//                if (!isDuplicate((txtUsername.getText().trim()))) {
//                    javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
//                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
//                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    javax.swing.JLabel label = new javax.swing.JLabel("Username Already exists. Use a different username.");
//                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
//                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);
//                    // check validation errors 
//                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new login user.");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AddNewLoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        // verify input data        
        // verify that new user does not currently exist 
        // if all validations are successful then enter the new user
        
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPasswordActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        //Showing the password text of the "SHOW" button is clicked
        if (jToggleButton1.isSelected()) {
            txtPassword.setEchoChar((char)0);
            txtConfirmPassword.setEchoChar((char)0);
            //txtConfirmPassword.setActionCommand("OK");//Check this
            //txtConfirmPassword.addActionListener((ActionListener) this);//Check this
            }
        else {
            txtPassword.setEchoChar('*');
            txtConfirmPassword.setEchoChar('*');
        }
        
            
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cmbUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserTypeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbUserTypeActionPerformed
    
    /*public static Optional<String> hashPassword (String password, String salt) {

    char[] chars = password.toCharArray();
    byte[] bytes = salt.getBytes();

    PBEKeySpec spec = new PBEKeySpec(chars, bytes, ITERATIONS, KEY_LENGTH);

    Arrays.fill(chars, Character.MIN_VALUE);

    try {
      SecretKeyFactory fac = SecretKeyFactory.getInstance(ALGORITHM);
      byte[] securePassword = fac.generateSecret(spec).getEncoded();
      return Optional.of(Base64.getEncoder().encodeToString(securePassword));

    } catch (NoSuchAlgorithmException | InvalidKeySpecException ex) {
      System.err.println("Exception encountered in hashPassword()");
      return Optional.empty();

    } finally {
      spec.clearPassword();
    }
  }
    
  public static boolean verifyPassword (String password, String key, String salt) {
    Optional<String> optEncrypted = hashPassword(password, salt);
    if (!optEncrypted.isPresent()) return false;
    return optEncrypted.get().equals(key);
  }*/
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JToggleButton jToggleButton1;
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
