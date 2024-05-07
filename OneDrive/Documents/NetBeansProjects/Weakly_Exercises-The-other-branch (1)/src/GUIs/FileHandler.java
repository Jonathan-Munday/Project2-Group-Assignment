/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sinovuyo
 */
public class FileHandler {
    private BufferedWriter bw;

    public void openfile() {
        try {
            bw = new BufferedWriter(new FileWriter("User information.txt"));
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Error occured");
        }
    }

    public void closefile() {
        try {
            bw.close();
        } catch (Exception e) {
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
}
