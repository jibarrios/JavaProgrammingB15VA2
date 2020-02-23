package day05_Practices_ScannerInput;
import java.util.Scanner;
public class ScannerSpeedCheck {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to SPeed Check Program. ");

        System.out.println("Enter your current speed: ");

        int currentSpeed = input.nextInt();

        //System.out.println("Current speed: " + currentSpeed);
        int speedLimit = 55;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " +overTheLimit+ " mph over the limit!");






    }
}
