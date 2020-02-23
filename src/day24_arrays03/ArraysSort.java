package day24_arrays03;
import java.util.*;
public class ArraysSort {
    public static void main(String[] args) {
        int [] nums = {44, 12, 5, 900, 1};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println("After sorting");
        System.out.println(Arrays.toString(nums));

        //declare companies

        String [] companies = {"Amazon", "Fashion Nova", "Dsw", "Apple", "Google"};
        //sort companies Arrays
        // when using this method if in capitals it affects when sort it they go first
        Arrays.sort(companies);

        System.out.println(Arrays.toString(companies));
        System.out.println(companies[0]); // the index changes which is why it print out
        // amazon

        String[] words = {"apples", "bananas", "cherries"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
