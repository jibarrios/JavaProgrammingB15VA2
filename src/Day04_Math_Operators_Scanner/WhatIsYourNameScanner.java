package Day04_Math_Operators_Scanner;
import java.util.Scanner;
public class WhatIsYourNameScanner {
    public static void main(String[] args){
        //so far we have been printing values to the screen
        /*java, we can also write program to accept an input while
        programming is running
         */
        Scanner input = new Scanner(System.in);
        //We type this line is the main method
        System.out.println("What is your name?");
        String name =  input.next();
        System.out.println("nice to meet you " + name);

    }
}
