/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Sinovuyo
 */
public class FileHandler {

    private BufferedWriter bw = null;
    private BufferedReader br = null;
    public static  ArrayList<Users> userRecords;
    public void openfile() {

    }

    public void closefile() {
        try {
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error occured");
        }

    }

    public void processFile(String rec) {
        try {
            bw.write(rec);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error occured");
        }

    }

    public void readFile() {
        String line = "";
        try {
            br = new BufferedReader(new FileReader("User information.txt"));
            while ((line = br.readLine()) != null) {
                String[] row = line.split("#");
                for (String index : row) {
                    System.out.printf("%-10s", index);
                    JOptionPane.showMessageDialog(null, index);
                }
                System.out.println("");
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IO exception");
        } finally {
            JOptionPane.showMessageDialog(null, "done");
        }

    }

    public void storeFile() {
        String line = "";
         userRecords = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("User information.txt"));
            while ((line = br.readLine()) != null) {
                String[] row = line.split("#");

                String firstname = row[0];
                String lastname = row[1];
                String password = row[2];
                String gender = row[3];
                int age = Integer.parseInt(row[4]);
                int phonenumber = Integer.parseInt(row[5]); 
                String email = row[6];
                
                
                // Create a Users object and add it to the ArrayList
                userRecords.add(new Users(firstname, lastname, password, gender, age, phonenumber, email));
            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IO exception");
        } 

    }

    public void writeToFIle(String rec) {
        try {
            bw = new BufferedWriter(new FileWriter("User information.txt"));

            bw.append(rec);

            bw.flush();
            bw.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error occured");
        }
    }
}
