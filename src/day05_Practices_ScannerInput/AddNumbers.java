package day05_Practices_ScannerInput;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        //input.nextInt() is to input whole #. keyword INT (Int)
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        //nextInt() is code for next int to appear after the first one

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
        // that is going to give the sum of the input that are put in
// negative testing would be invalid input. example here is 23.4, one
        //b/c of int that's for whole numbers




    }
}
