package day17_while_do_While_loop;
import java.util.*;
public class GiveMe5or10Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars or 10 dollars");
        int dollars = scan.nextInt();
        while (dollars != 5 && dollars !=10) {
            System.out.println("Give me 5 dollars or 10 dollars");
            dollars = scan.nextInt();
        }
        System.out.println("Thank you for $" + dollars);

    }
}
