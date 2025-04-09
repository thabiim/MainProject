/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.main;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    // Test: Username is correctly formatted.
    @Test
    public void testCheckUserName_Correct() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Tester");
        assertTrue(user.checkUserName());
    }
    
    // Test: Username is incorrectly formatted.
    @Test
    public void testCheckUserName_Incorrect() {
        Login user = new Login("kyle!!!!!", "Ch&&sec@ke99!", "Kyle", "Tester");
        assertFalse(user.checkUserName());
    }
    
    // Test: Password meets complexity requirements.
    @Test
    public void testCheckPasswordComplexity_Correct() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Tester");
        assertTrue(user.checkPasswordComplexity());
    }
    
    // Test: Password does not meet complexity requirements.
    @Test
    public void testCheckPasswordComplexity_Incorrect() {
        Login user = new Login("kyl_1", "password", "Kyle", "Tester");
        assertFalse(user.checkPasswordComplexity());
    }
    
    // Test: Successful login.
    @Test
    public void testLoginUser_Success() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Tester");
        assertTrue(user.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
    
    // Test: Failed login.
    @Test
    public void testLoginUser_Failure() {
        Login user = new Login("kyl_1", "Ch&&sec@ke99!", "Kyle", "Tester");
        assertFalse(user.loginUser("wrongUser", "wrongPassword"));
    }
   
    
}
    
    

