package Day25_Arrays04_split;
import day24_arrays03.ArraysSort;

import java.util.*;
public class Sentence2 {
    public static void main(String[] args) {
        String words = "java";
        char [] letters = words.toCharArray();
        System.out.println("letters length: " + letters.length);
        for(char l : letters){
            System.out.println(l);// can do with charAt()
        }
        Arrays.sort(letters);
        System.out.println(letters);

        //print with commas
        System.out.println(Arrays.toString(letters));

        String rad = "dlfnslssmmd";
        char [] strArr = rad.toCharArray();
        Arrays.sort(strArr);


        // after sorting, create a new string w/ that value of arrays
        String sorted = new String(strArr);
        System.out.println("rad: " + rad);
        System.out.println("sorted: " + sorted);
        System.out.println(Arrays.toString(strArr));


    }
}
