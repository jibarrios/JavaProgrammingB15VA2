package day61_Collections3;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();

        Set<Integer> set2 = new HashSet<>();//polymorphism way

        set2.add(10);
        set2.add(10);// It only adds it once b/c it already exist in the list. only uniqueness is added
        set2.add(55);
        set2.add(66);
        set2.add(77);
        set2.add(88);
        set2.add(100);

        System.out.println(set2.toString());

       // System.out.println(set1(0)); There are no indexes in HashSet
        System.out.println(set2.contains(100));

        for (int num : set2) {
            System.out.println("num = " + num);

        }
        Iterator<Integer> itset = set2.iterator();

        System.out.println(itset.next());
        System.out.println(itset.next());


        while(itset.hasNext()){


        }



    }
}
