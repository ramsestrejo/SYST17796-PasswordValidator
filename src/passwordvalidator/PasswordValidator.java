/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * A class to validate a user's chosen password.
 * The password must have a length of at least 8
 * at least one uppercase character and at least one
 * special character (character that is not a letter or number).
 * This is also our class under test
 * @author dancye, 2018
 */
public class PasswordValidator  {
public static final int PASSWORD_LENGTH = 8;
public static final String SPECIAL_CHARS = "[!@#$%&*()_+=|<>?]";
public static final Pattern patt = Pattern.compile( SPECIAL_CHARS );

    /**
     * Main method cycles through our static utility methods
     * to determine whether the password is valid or not.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isValid=false;
        do {
            System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            Scanner sc = new Scanner(System.in);
            String pass = sc.nextLine();
            if ( isValidPassword( pass ) ) {
               isValid = true;
            }
        }
        while(  !isValid );
        System.out.println("Valid password, accepted!");
    }
    
    /**
     * A method to check whether a password is at least length 8
     * @param pass - the String to check
     * @return true if length is greater than or equal to 8 and false otherwise
     */

    public static boolean isValidPassword( String password ) {
        return checkLength( password ) && checkUpperCase( password ) && 
        checkSpecialChar( password );
    }

    protected static boolean checkLength( String password ) {
        return password.length( ) >= PASSWORD_LENGTH;
    }

    protected static boolean checkUpperCase( String password ) {
        for ( int i = 0 ; i < password.length( ) ; i ++ ) {
            if ( Character.isUpperCase( password.charAt( i ) ) )
                return true;
        }
        return false;
    }

    protected static boolean checkSpecialChar( String password ) {
        Matcher match = patt.matcher( password );
        return match.find( );
    }
    
}
