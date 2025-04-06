/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    
    // Constructor to capture user details
    public Login(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // Method: checkUserName()
    // Ensures the username contains an underscore and is no more than 5 characters long.
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }
    
    // Method: checkPasswordComplexity()
    // Validates that the password is at least 8 characters long, contains a capital letter,
    // a number, and a special character.
    public boolean checkPasswordComplexity() {
        if (password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;
        return password.matches(".*[^a-zA-Z0-9].*");
    }
    
    // Method: registerUser()
    // Returns registration messages depending on whether the username and/or password are valid.
    public String registerUser() {
        boolean usernameValid = checkUserName();
        boolean passwordValid = checkPasswordComplexity();
        
        if (!usernameValid && !passwordValid) {
            return """
                   Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.
                   Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.""";
        } else if (!usernameValid) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!passwordValid) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else {
            return "Username successfully captured\nPassword successfully captured";
        }
    }
    
    // Method: loginUser()
    // Verifies that the entered username and password match the ones provided during registration.
    public boolean loginUser(String usernameInput, String passwordInput) {
        return username.equals(usernameInput) && password.equals(passwordInput);
    }
    
    // Method: returnLoginStatus()
    // Returns the login message based on whether the login was successful.
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Login failed. Please check your username and password.";
        }
    }
}
