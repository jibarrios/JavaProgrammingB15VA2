package day05_Practices_ScannerInput;
import java.util.Scanner;
public class Grocery_Part2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = input.nextDouble();
        double weeklySalary = hourlyRate * 40;
        double monthlySalary = weeklySalary * 52 / 12;
        double annualSalary = monthlySalary * 12;


    }
}
