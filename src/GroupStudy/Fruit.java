package GroupStudy;

import java.util.*;

public class Fruit {
    public static void main(String[] args) {
        ArrayList<GroceryStore> shoppingList = new ArrayList<>();
        shoppingList.add(new GroceryStore("green","apple",1.99));
        shoppingList.add(new GroceryStore("red","apple",1.45));
        shoppingList.add(new GroceryStore("yellow","grape",2.99));
        shoppingList.add(new GroceryStore("green","watermelon",2.99));
        shoppingList.add(new GroceryStore("green","pear",3.55));
        shoppingList.add(new GroceryStore("Orange","orange",1.45));


        double max = shoppingList.get(0).getPrice();
        for (int i = 0; i < shoppingList.size() ; i++) {
             if(max < shoppingList.get(i).getPrice()) {
                 max = shoppingList.get(i).getPrice();
             }
        }
        System.out.println("Max: " + max);
        double min = shoppingList.get(1).getPrice();
        for (int i = 0; i < shoppingList.size(); i++) {
            if(min>shoppingList.get(i).getPrice()){
                min = shoppingList.get(i).getPrice();
            }
        }
        System.out.println("Min: "+min);
        double discountPrice= 0;
        for (int i = 0; i < shoppingList.size() ; i++) {
           discountPrice = shoppingList.get(i).getPrice()* .50;


            
        }



        }


    }


