package day58_exceptions3;

import java.net.MalformedURLException;
import java.net.URL;

public class TryClassFinally {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");

            java.net.URL estsyURL = new URL("www.estsyURL");
            // you dont have to import class you can add the name
            //EX: Java.net
        } catch (MalformedURLException e) {
            //e.printStackTrace();
            System.out.println("MalformedURLException is caught and handled");

            System.out.println("Reason: " + e.getMessage());
        }finally {
            System.out.println("Finally Block - Runs Always");
        }
        System.out.println("After TRY CATCH FINALLY.... ");


        try {
            System.out.println("In 2nd try block...");
            int num = Integer.parseInt("123abc");
            System.out.println("End of second try block");
        } catch (NumberFormatException e) { //If the exception does not match
            //It will go straight to finally block and stop then print the ERRor msg
            System.out.println("NumberFormatException was caught and handled");
            System.out.println("GetMessage() " + e.getMessage());
            System.out.println("getCause() " + e.getCause());

        }finally {
            System.out.println("2nd Finally block. runs all time...");
        }
        System.out.println("AFTER 2ND TRY CATCH FINALLY");

    }
}
