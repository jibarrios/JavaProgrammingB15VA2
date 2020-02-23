package day58_exceptions3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchNoOtherOption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter number: ");
            int n = scan.nextInt();
            System.out.println("n = " + n);
        }catch (InputMismatchException e){
            System.out.println("Invalid Input, only numbers are allowed");
            System.out.println("Please Try again");
            main(null); // Lets you repeat the step until the number are the
            //input but the method take up a lot of memory. not recommend
        }
    }
}
