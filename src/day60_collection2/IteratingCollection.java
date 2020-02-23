package day60_collection2;
import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class IteratingCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java"); list.add("Js"); list.add("html");
        list.add("ruby");list.add("python");list.add("kotlin");

        for (String str : list) {
            System.out.println(str);
            //list.remove(str); <- ConcurrentModificationException



            //Iterator interface can be used to iterator
            //declaring Iterator variable and assigning our list
            //giving out list to the Iterator
            Iterator<String> it = list.iterator();

            System.out.println(it.hasNext());
            System.out.println(it.next());
            System.out.println(it.next());

            while(it.hasNext()){
                System.out.println(it.next());//Print current value and goto next
                it.remove();//removes the current value
            }
            System.out.println(list.toString());//List is now empty ConcurrentModificationException


        }
    }
}
