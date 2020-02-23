package day05_Practices_ScannerInput;
import java.util.Scanner;// keyword import
public class GroceryShopping {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Harris Teeter");
        System.out.println("How much are potatoes? ");
        double price1 = input.nextDouble();
        //after next the data type, first letter needs to be in Capital
        System.out.println("How much are tomatoes? ");
        double price2 = input.nextDouble();
        System.out.println("How much are eggplant? ");
        double price3 = input.nextDouble();

        double total = price1 + price2 + price3;
        System.out.println("Total is $" + total);





    }

}
