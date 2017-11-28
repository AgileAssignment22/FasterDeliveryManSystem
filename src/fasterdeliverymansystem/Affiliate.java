/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fasterdeliverymansystem;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Affiliate implements Serializable {
    String companyName;
    String affUserName;
    String affPassword;
    String affEmail;
    String contactNumber;
    
    public Affiliate(String affUserName, String affPassword, String companyName, String affEmail, String contactNumber) {
        this.affUserName = affUserName;
        this.affPassword = affPassword;
        this.companyName = companyName;
        this.affEmail = affEmail;
        this.contactNumber = contactNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAffUserName(String affUserName) {
        this.affUserName = affUserName;
    }

    public void setAffPassword(String affPassword) {
        this.affPassword = affPassword;
    }

    public void setAffEmail(String affEmail) {
        this.affEmail = affEmail;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAffUserName() {
        return affUserName;
    }

    public String getAffPassword() {
        return affPassword;
    }

    public String getAffEmail() {
        return affEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }
    
    public String toString() {
        return String.format("%s-%s",affUserName, affPassword);
    }
    
}
