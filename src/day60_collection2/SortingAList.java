package day60_collection2;
import java.util.*;
public class SortingAList  {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java"); list.add("Js"); list.add("html");
        list.add("ruby");list.add("python");list.add("kotlin");
        list.add("A++");
        System.out.println("Before  Sorting");
        System.out.println(list.toString());

        Collections.sort(list);
        System.out.println("--- After Sorting --- ");


        List<Product> prodList = new ArrayList<>();
        prodList.add(new Product("wooden Spoon",12.99));
        prodList.add(new Product("computer bag",105.99));
        prodList.add(new Product("shoes",54.99));
        prodList.add(new Product("bmw 525i",2700.99));
        prodList.add(new Product("MacBook pro",1499.99));


        System.out.println("----  BEFORE  SORTING -----");
        System.out.println(prodList.toString());


       // Collections.sort(prodList);













    }


}
