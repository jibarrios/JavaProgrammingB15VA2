package Review_Basics101;

import java.util.*;

public class OOP2_cars {
    public static void main(String[] args) {
        ArrayList<OOP_Cars> carList = new ArrayList<>();
        carList.add(new OOP_Cars("GT", "Mercedes", 101234.0));
        carList.add(new OOP_Cars("i8", "BMW", 155678.23));
        carList.add(new OOP_Cars("4Runner", "Toyota", 36435.45));
        carList.add(new OOP_Cars("GTR", "Nissan", 113523.));


        System.out.print("Number of Cars for sale: " + carList.size());
        System.out.println();

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).names + " " + carList.get(i).brand + " " + carList.get(i).getPrice());
        }
        carList.remove(2);
        carList.add(new OOP_Cars("Civic type R", "Honda", 45045.50));
        System.out.println("************");
        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).names + " " + carList.get(i).brand + " " + carList.get(i).getPrice());

        }
        System.out.println("********");
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).names.equals("i8")) {
                carList.get(i).setPrice(carList.get(i).getPrice() * 0.5);
                System.out.println(carList.get(i).names + " " + carList.get(i).brand + " " + carList.get(i).getPrice());
            }
        }
        for (int i = 0; i < carList.size(); i++) {
            carList.get(i).special();
            //  System.out.println(carList.toString());

        }
    }
    }


