/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcgui;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author USER01
 */
public class PasswordEncryption {
    
    // takes in a password and hashes it using md5
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        
        byte[] digest = md.digest(password.getBytes());
        String hash = toHexString(digest);
        
        return hash;
    }
    
    // converts an array of bytes to a string
    static String toHexString(byte[] hash)   {  
        BigInteger number = new BigInteger(1, hash);  
  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
  
        while (hexString.length() < 32)   {  
            hexString.insert(0, '0');  
        }  
  
        return hexString.toString();  
    }  
    
}
