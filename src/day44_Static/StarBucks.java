package day44_Static;

import java.util.*;
import java.util.concurrent.Callable;

public class StarBucks {
    /* Create a method: drinkCoffee
    param: coffee Coffee
    return: void
    Drinking cappuccino  & Coding Java

    how do you call it?
    Coffee latte = new Coffee ("latte", "tall", 4.33)
    drinkCoffee(latte);
    */
    /* method: orderCoffee
      param: String coffeeNAme, String coffeeSize
      return: Coffee
      Create coffeObj using coffeeName, CoffeeSize,43.99
     */
    public static Coffee orderCoffee (String coffeeName, String coffeeSize ) {
        System.out.println("Perparing " + coffeeName + coffeeSize);
        Coffee readyCoffee = new Coffee(coffeeName, coffeeSize, 0.99) ;
        return readyCoffee;

    }
    public static void drinkCoffee(Coffee coffeeObj){
        System.out.println("Drinking " + coffeeObj.getName() + " and coding Java");

    }


    public static void main(String[] args) {
    Coffee cappuccino = new Coffee("cappuccino","grande",3.99);
    cappuccino.drink();
        System.out.println(cappuccino.toString());

        //Syntax of array of coffee

        Coffee[] coffeeArrays = new Coffee[2];
        coffeeArrays[0] = cappuccino;
        coffeeArrays[1] = new Coffee("Latte","Venti",5.99);

        System.out.println(Arrays.toString(coffeeArrays));


        //ArrayList of Coffees

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(cappuccino);
        coffeeList.add(coffeeArrays[1]);
        coffeeList.add(new Coffee("Nitro Brew", "tall",3.49));

        System.out.println(coffeeList.toString());

        //drink First coffee
        coffeeList.get(0).drink();

        //Drink all of them
        //for(String each : coffeelist) wouldnt work b/c we get data from Coffee
        for (Coffee each : coffeeList){
            each.drink();
        }
        System.out.println("------ CALL CUSTOM METHOD -----");
        Coffee hotChocolate = new Coffee("Hot Chocolate","venti",4.99);
        //call the method pass the coffee Object
        drinkCoffee(hotChocolate);
        drinkCoffee(cappuccino);
        drinkCoffee(new Coffee("Mocha","tall",4.79));

        System.out.println(" ---- CALL ORDERCOFFEE METHOD ---");
        Coffee myCoffee=orderCoffee("white mocha", "grande");
        myCoffee.drink();
        System.out.println(myCoffee.toString());
        Coffee myVentiLatte=orderCoffee("Vanilla Latte" , "venti");
        myVentiLatte.drink();






    }
}
