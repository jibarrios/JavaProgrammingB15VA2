package Day07_Operators_casting_boolean_if;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Multiplier {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Multiplier!");
        System.out.println("Enter 2 numbers:");
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        int results = num * num2;
        System.out.println(num + " x " +num2 + " = "+results);

    }
}
