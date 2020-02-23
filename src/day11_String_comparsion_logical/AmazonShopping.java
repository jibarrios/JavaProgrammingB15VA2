package day11_String_comparsion_logical;
import java.util.Scanner;
public class AmazonShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to amazon.com!");
        System.out.println("Are you a PrimeMember");
        String answer = scan.next();
        //if value of answer is yes then boolean is inop b/c it either true/False
        /* if you want that as answer need to use String Ex: String answer = scan.next()

         */
        boolean isPrimeMember;
        if (answer.equalsIgnoreCase("yes")){
            isPrimeMember = true;
    }else{
            isPrimeMember = false;
        }
        System.out.println("Enter total order Price: ");
        double totalOrderPrice = scan.nextDouble();

        if(totalOrderPrice <= 0){ // The purpose of this part id to protect the main part
            System.out.println("Invalid Order Price");
            return;// stop Program at this point. do not run rest of code below
        }

        if(isPrimeMember || totalOrderPrice >= 25.0){
            System.out.println("Your order is eligible for free shipping");
        }else {
            System.out.println("Your order is not eligible for free shipping");
        }
    }
}
