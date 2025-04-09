/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Main {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Registration process
        System.out.println("Create an account by entering the following details:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        
        Login user = new Login(username, password, firstName, lastName);
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);
        
        // Proceed to login only if registration conditions are met
        if (user.checkUserName() && user.checkPasswordComplexity()) {
            System.out.println("\nPlease login to your account.");
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();
            
            boolean loginSuccess = user.loginUser(loginUsername, loginPassword);
            System.out.println(user.returnLoginStatus(loginSuccess));
        } else {
            System.out.println("\nRegistration failed. Cannot proceed to login.");
        }
        
        
    }
}
