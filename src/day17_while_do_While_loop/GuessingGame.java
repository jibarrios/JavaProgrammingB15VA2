package day17_while_do_While_loop;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100);// java picks number
        int guessingNumber = 0;


        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();

            if (guessingNumber > secretNumber) {
                System.out.println(" Wrong your number is to big");
            }else if (guessingNumber < secretNumber) {
            System.out.println("Wrong your number is to small");
        }
            }while(guessingNumber != secretNumber);
            System.out.println("Congrats You won!");
    }
}
