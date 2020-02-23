package day35_MoreMethodPractices;
import java.util.*;
public class cooking {
    public static void main(String[] args) {
        scrambledEggsRecipes();
//        System.out.println("Scrambled Eggs Recipes");
//        add("oil","eggs","salt", "cheese");
//        mix(10);
//        fry(3);
//        System.out.println("~~~Enjoy your eggs~~~");
//        System.out.println("~~~Pasta Recipes~~");
//        boil(1);
//        add("oil","Spaghetti","salt", "cheese");
//        boil(10);
//        System.out.println("Pick up Wooden Spoon");
//        mix(100);
//        System.out.println("~~~Drain the water and enjoy then code JAVA ~~~");
        pastaRecipe();

    }
    public static void pastaRecipe(){
        System.out.println("~~~Pasta Recipes~~");
        boil(1);
        add("oil","Spaghetti","salt", "cheese");
        boil(10);
        System.out.println("Pick up Wooden Spoon");
        mix(100);
        System.out.println("~~~Drain the water and enjoy then code JAVA ~~~");

    }
    public static void scrambledEggsRecipes(){
        System.out.println("Scrambled Eggs Recipes");
        add("oil","eggs","salt", "cheese");
        mix(10);
        fry(3);
        System.out.println("~~~Enjoy your eggs~~~");
    }

    public static void add(String... items){
        System.out.println("Adding- " + Arrays.toString(items));

    }
    public static void mix(int seconds) {
        System.out.println("Mix for " + seconds + " seconds");
    }
    public static void boil(int minutes){
            System.out.println("Boil " + minutes + " Minutes");
    }
    public static void fry(int minutes) {
        System.out.println("Fry " + minutes + " Minutes");
    }
    public static void bake(int minutes){
                System.out.println("Bake " + minutes + "Minutes");
            }
}
