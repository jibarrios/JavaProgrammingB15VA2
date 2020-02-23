package Day06_Opertors;
import java.util.Scanner;
public class NextLine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your full name?");
        String fullName = scan.nextLine();// this is only going to output first word
        // when your using nextLine it uses multi words entered
        System.out.println(fullName + " is coding Java");


        System.out.println("Enter your address? ");

        String address = scan.nextLine();
        // You have to use all nextLine for all variables
        // scan.next() doesn't have this issue
        System.out.println(fullName + " Lives in " + address);


        int steps = 100;
        System.out.println(steps);
        steps = (steps + 20);
        System.out.println(steps);//80

        int total = 50;
        int num = 10;
        System.out.println(total);
        System.out.println(total - num);//40
        System.out.println(total);









    }

}
