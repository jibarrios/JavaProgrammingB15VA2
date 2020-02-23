package day61_Collections3;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //key , Value
        Map<String, Double> map = new HashMap<>();
        map.put("eggs", 4.45);
        map.put("Strawberries", 7.99);
        map.put("potatoes", 7.0);
        map.put("cat food", 18.0);
        map.put("milk", 3.99);
        map.put("cookie", 3.49);
        map.put("cookie", 3.99); //Will take this price (not always)


        System.out.println(map.toString());
        System.out.println("Size : " + map.size());


        System.out.println("Price of eggs: " + map.get("eggs"));
        System.out.println(map.get("Strawberries"));
        System.out.println(map.get("potatoes"));
        System.out.println(map.get("cat food"));
        System.out.println(map.get("cookies"));

        System.out.println( map.keySet()); //all KEys in hashSet format
        System.out.println(map.values()); //All Values in collection format

        for(String key : map.keySet()){
            System.out.print("Key = " + key);
            System.out.println(", Value = " + map.get(key));
        }





    }
}
