/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sinovuyo
 */
public class Users {

    private String Firstname;
    private String Password;
    private String Lastname;
    private String Gender;
    private int Age;
    private int PhoneNumber;
    private String EmailAddress;

//    public Users(String Firstname, String Lastname, String Password,  int Age, int PhoneNumber, String EmailAddress) {
//        this.Firstname = Firstname;
//        this.Lastname = Lastname;
//        this.Password = Password;
//        this.Age = Age;
//        this.PhoneNumber = PhoneNumber;
//        this.EmailAddress = EmailAddress;
//    }

    public Users(String Firstname, String Lastname, String Password, String Gender, int Age, int PhoneNumber, String EmailAddress) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Password = Password;
        this.Gender = Gender;
        this.Age = Age;
        this.PhoneNumber = PhoneNumber;
        this.EmailAddress = EmailAddress;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getSurname() {
        return Lastname;
    }

    public void setSurname(String Lastname) {
        this.Lastname = Lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

   

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public String toString() {
        return "Users{" + "Firstname=" + Firstname +"\n"+"Lastname= "+Lastname + "\n Password=" + Password + "\n Age=" + Age + "\n PhoneNumber=" + PhoneNumber + "\n EmailAddress=" + EmailAddress + '}';
    }
//public void writeToFIle(String rec){
//        FileHandler objfh = new FileHandler();
//        objfh.openfile();
//       // String rec = Firstname+"#"+Lastname+"#"+Password+"#"+Age+"#"+Gender+"#"+PhoneNumber+"#"+EmailAddress;
//        objfh.processFile(rec);
//        objfh.closefile();
//    }
//public void readFIle(String rec){
//        FileHandler objfh = new FileHandler();
//        objfh.openfile();
//       // String rec = Firstname+"#"+Lastname+"#"+Password+"#"+Age+"#"+Gender+"#"+PhoneNumber+"#"+EmailAddress;
//        objfh.processFile(rec);
//        objfh.closefile();
//    }
    public Boolean validateUsername(String username) {
        String regex = "^[a-zA-Z]+$";
        if (!username.matches(regex) || username.equals("")) {
            return false;
        }
        return true;
    }
    
     public  boolean validatePhoneNumber(String phoneNumber) {
        // Regular expression to match a phone number in international format
        String regex = "0[0-9]{9}$";
        
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(phoneNumber);
        
        // Check if the phone number matches the pattern
        return matcher.matches();
    }
     public boolean   validateEmail(String email) {
        // Regular expression to match email addresses
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);
        
        // Create matcher object
        Matcher matcher = pattern.matcher(email);
        
        // Check if the email address matches the pattern
        return matcher.matches();
        
    }
     public  boolean validatePassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }
        
        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        
        // Check if password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        
        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        
        // Check if password contains at least one special character
        if (!password.matches(".*[!@#$%^&*()-_+=].*")) {
            return false;
        }
        
        // If all checks pass, return true
        return true;
    }
    public  boolean validateAge(String age) {
        // Check if input is empty
        if (age.isEmpty()) {
            return false;
        }
        
        // Check if input is a valid number
        try {
            int ageNum = Integer.parseInt(age);
            
            // Check if age is within a reasonable range
            if (ageNum < 18 || ageNum > 100) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        
        // If all checks pass, return true
        return true;
    }

}
