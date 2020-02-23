package day50_inheritance_hiding;

import java.util.*;
public class Burger7 {
    public static void main(String[] args) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("onion crisps",7));
        ingredients.add(new Ingredient("american cheese",120));
        ingredients.add(new Ingredient("pickles",10));
        ingredients.add(new Ingredient("lettuce",5));
        ingredients.add(new Ingredient("b7 sauce",200));
        Burger b7Burger = new Burger("COWBOY",ingredients);
        System.out.println(b7Burger.getIngredients().toString());
        System.out.println(b7Burger.toString());
    }
}




