package day59_exceptions_collection1.collection;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();

        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C#");
        linkedList.add("C++");
        linkedList.addFirst("Html");
        linkedList.addLast("JavaScript");


        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());


        for(String each : linkedList){
            System.out.println("Each = " + each);
        }



    }
}
