/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.prac5;

/**
 *
 * @author JonathansPC
 */
import javax.swing.JOptionPane;

public class UserLoginForm {

    public static void main(String[] args) {
        // Create an instance of the User class
        User user = new User("", "");

        while (true) {
            // Display the login form
            showLoginForm(user);

            // Validate the credentials (for simplicity, just check if both fields are non-empty)
            if (!user.getUsername().isEmpty() && !user.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Login successful!\nUsername: " + user.getUsername());
                break; // Break out of the loop if the login is successful
            } else {
                JOptionPane.showMessageDialog(null, "Please enter both username and password!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void showLoginForm(User user) {
        // Create an array of objects to represent the form components
        Object[] components = {"Username:", user.getUsername(), "Password:", user.getPassword()};

        // Display the form using JOptionPane
        int option = JOptionPane.showOptionDialog(
                null,
                components,
                "Login Form",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Login", "Clear", "Exit"},
                "Login");

        // Process the user's choice
        switch (option) {
            case 0: // Login button pressed
                user.setUsername(components[1].toString());
                user.setPassword(components[3].toString());
                break;
            case 1: // Clear button pressed
                user.setUsername("");
                user.setPassword("");
                break;
            case 2: // Exit button pressed
            case JOptionPane.CLOSED_OPTION:
                System.exit(0);
        }
    }
}
