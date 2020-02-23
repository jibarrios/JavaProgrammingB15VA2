package day24_arrays03;

import java.util.*;

public class ArraysEquals {
    public static void main(String[] args) {
        // never use == with Arrays

        int[] num1 = {4, 5, 2, 10};
        int[] num2 = {4, 5, 2, 10};
        int[] num3 = {10, 4, 2, 5};
        int[] num4 = {4, 5, 2, 10, 90};
        int[] num5 = {54, 23, 54, 123, 54};

        System.out.println("num1 == num2 " + Arrays.equals(num1,num2) );
        System.out.println("num1 == num2 > " + (num1 == num2));

        boolean bool1 = Arrays.equals(num2, num3);

        System.out.println("num1 == num2 > " + bool1);

        Arrays.sort(num2);
        Arrays.sort(num3);

        System.out.println("After Sorting: num2 == num3 > " +Arrays.equals(num2,num3));


        String [] car1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String [] car2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String [] car3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String [] car4  = {"Toyota", "Honda", "Tesla"};

        System.out.println("car1 == car2 " + Arrays.equals(car1,car2) );
        System.out.println("car2 == car3 " + Arrays.equals(car2,car3) );

        boolean equals = Arrays.toString(car2).equalsIgnoreCase(Arrays.toString(car3));

        System.out.println("equals: "+ equals);





    }
}
