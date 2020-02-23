package Day37_Arrayslist;
import java.util.*;
public class ArrayListMethod {
        //isEmpty, contains, indexOf, clear();
        public static void main(String[] args) {
            ArrayList<String> shoppingList = new ArrayList<>();
            //check if list is empty
            System.out.println("isEmpty() - " + shoppingList.isEmpty() );
            System.out.println("size() == 0 - " + (shoppingList.size() == 0) );
            if(shoppingList.isEmpty() ){
                System.out.println("List is empty, nothing to buy. Keep coding java");
            }else{
                System.out.println("List is not empty. code java then go to mall");
            }
            shoppingList.add("Apple Laptop");
            shoppingList.add("Tesla");
            shoppingList.add("Sport shoes");
            shoppingList.add("T-shirt");
            shoppingList.add("Jacket");
            shoppingList.add("Hat");
            shoppingList.add("Wooden spoon");
            //check if list is still empty. run if statement again
            if(shoppingList.isEmpty()){
                System.out.println("List is empty, nothing to buy. Keep coding java");
            }else{
                System.out.println("List is not empty. code java then go to mall");
            }
            //get count and assign into variable count>
            int count = shoppingList.size();
            System.out.println("Count of items to buy - " + count);
            //check if 'Jacket' is among the items
            //contains method
            System.out.println("list.contains(jacket) - " + shoppingList.contains("Jacket"));
            if (shoppingList.contains("Jacket")){
                System.out.println("Jacket on the list. Buy it then code java");
            }else{
                System.out.println("Jacket is not on list. keep coding java");
            }
            System.out.println("5 in list - " + shoppingList.contains(5) );
            System.out.println("cellphone - " + shoppingList.contains("cellphone") );
            //find the index of 'Tesla', 'Apple Laptop', 'Hat'
            System.out.println("Tesla index : " + shoppingList.indexOf("Tesla"));
            System.out.println("Apple laptop index: " + shoppingList.indexOf("Apple Laptop"));
            System.out.println("Hat index : " + shoppingList.indexOf("Hat"));
            System.out.println("Break index : " + shoppingList.indexOf("break"));
            //remove everything.
            shoppingList.clear();
            System.out.println(shoppingList);
        }
    }