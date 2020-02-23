package day61_Collections3;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String>  set = new HashSet<>();

        set.add("Java");
        set.add("Java");// Still removes since there is an existing item in the list
        set.add("selenium");
        set.add("html");
        set.add("sql");
        set.add("git");
        set.add("ruby");


        System.out.println("size = " + set.size());
        System.out.println(set.toString()); //Link keeps the order of the input

        set.remove("Java");
        System.out.println(set.toString());


        set.forEach(value -> System.out.print(value + " ")); // <- same as for each loop
        System.out.println();

        for (String each: set ) {
            System.out.print(each + " ");
        }


    }
}
