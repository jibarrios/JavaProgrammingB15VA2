package Review_Basics101;
import java.util.*;
public class Groceries {
    public static void main(review_Man[] args) {
        Scanner scan = new Scanner(System.in);
        String item1,item2,item3;
        double price1,price2,price3;

        System.out.println("Enter First item & Price: ");
        item1=scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Second item & Price");
        item2=scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Third item & Price");
        item3=scan.next();
        price3 = scan.nextDouble();


         String receipt = item1+ "- $"+ price1 + " \n" + item2 + "- $"  + price2 +
                 "\n"+ item3 + "- $" + price3;

         double total = price1 + price2 + price3;

        System.out.println(receipt + "\nTotal: $" + total);


    }
}
