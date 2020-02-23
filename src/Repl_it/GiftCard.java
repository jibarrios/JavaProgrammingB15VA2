package Repl_it;
import java.util.*;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();//Overthinking
        double balance = 100;
        if(item.equals("hat")){
            System.out.println("Thank you for your purchase!");
            double change = balance -25;
            System.out.println("Your current balance is: " + change);

        }else if(item.equals("pants")){

            System.out.println("Thank you for your purchase!");
            double change1 = balance - 50;
            System.out.println("Your current balance is: " + change1);

        }else if(item.equals("Laptop")){
            System.out.println("Sorry,not enough funds on your gift card");
        }
        System.out.println(balance);
    }
}
