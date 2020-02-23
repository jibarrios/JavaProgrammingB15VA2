package day11_String_comparsion_logical;
import java.util.*;
public class CarShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = 35000.0;
        System.out.println("Welcome to our Car Dealership!");

        System.out.println("Enter model:");
        String carModel = scan.next();

        System.out.println("Enter Price:");
        double carPrice = scan.nextDouble();
        if(carModel.equals("toyota") || carModel.equals("tesla")  && carModel.equals("BMW")|| carModel.equals("Audi") && carPrice <= budget){
            System.out.println("I like this model");
        }else {
            System.out.println("I dont like this car model");
        }
        }

    }

