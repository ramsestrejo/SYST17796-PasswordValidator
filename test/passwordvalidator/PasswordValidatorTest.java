/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * A class to test the methods in our passwordValidator
 * @author dancye, 2018
 */
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of checkLength method, of class PasswordValidator.
     * This test gives a good input of MyPassword123, which should
     * easily be long enough to be a good length.
     */
    @Test
    public void testCheckLengthPositive() {
        String pass = "MyPassword123";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }

    @Test
    public void testCheckLengthNegative() {
        String pass = "short";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(false, result);
       
    }

    @Test
    public void testCheckLengthBoundary() {
        String pass = "Password";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }


    @Test
    public void testCheckUpperCasePositive( ){
        String pass = "ThisisaPassword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }

    @Test
    public void testCheckUpperCaseNegative(){
        String pass = "thisisapassword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(false, result);
       
    }

    @Test    
    public void testCheckUpperCaseBoundary(){
        String pass = "Thisisapassword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true , result);
       
    }


    @Test
    public void testCheckSpecialCharPositive( ){
        String pass = "Th!sisaP@ssword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true, result);
       
    }

    @Test
    public void testCheckSpecialCharNegative( ){
        String pass = "ThisisaPassword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(false, result);
       
    }

    @Test    
    public void testCheckSpecialCharBoundary( ){
        String pass = "ThisisaP@ssword";
        boolean result = PasswordValidator.checkLength(pass);
        assertEquals(true , result);
       
    }    

    
}
