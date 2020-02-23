package day61_Collections3;

import day60_collection2.City;

import java.util.*;

public class CitiesHashSet {
    public static void main(String[] args) {
        Set<String> citySet = new HashSet<>();

        City c1 = new City("Calamba");
        City c2 = new City("Calamba");
        City c3 = new City("Urumqi");
        City c4 = new City("qashgar");
//
//        citySet.add(c1);
//        citySet.add(c2);
//        citySet.add(c3);
//        citySet.add(c4);

        System.out.println(citySet.size());
        System.out.println();





        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(10);
        numList.add(100);
        numList.add(100);
        numList.add(100);

        Set<Integer> numsSet = new HashSet<>(numList);

        System.out.println("numList = " + numList);
        System.out.println("numsSet = " + numsSet);





    }
}

