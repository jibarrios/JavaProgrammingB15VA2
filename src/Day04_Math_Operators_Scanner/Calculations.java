package Day04_Math_Operators_Scanner;

public class Calculations {
    public static void main (String[] args){
        double price1 = 15.5;
        double price2 = 55.1;
        double price3 = 10.0;

        double totalPrice = price1 + price2 + price3;
System.out.println("Total price" + totalPrice);

double balance = 1200.0;
double remainingBalance = balance - totalPrice;
System.out.println("Remaining balance: " + remainingBalance);
System.out.println(balance - totalPrice);

/*declare variable */

 int linesOfCode = 25;
 int classCount = 6;
         System.out.println(linesOfCode * classCount);
 System.out.println("total lines of code: " + linesOfCode * classCount);
int totalLinesOfCode = linesOfCode * classCount;
System.out.println ("total lines of code:" + totalLinesOfCode);

    }
}
