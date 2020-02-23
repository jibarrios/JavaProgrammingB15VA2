package Day06_Opertors;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fahrenheit value: ");
        double fahrenheit = input.nextDouble();
        //C= (F-32) * 5/9
        double celsius = (fahrenheit - 32)*5/9;
        System.out.println(fahrenheit + " is " + celsius+ " in celsius");

        System.out.println("#### C to F CONVERTER");
                // F= (C* 9/5) + 32
        System.out.println("Enter celsius");
celsius = input.nextDouble();
double fahrenheit2= (celsius * 9/5) +32;
System.out.println(celsius+ " is " + fahrenheit2  + " in Fahrenheit");





    }
}
