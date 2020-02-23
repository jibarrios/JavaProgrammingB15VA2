package day24_arrays03;
import java.util.*;
public class ArraysUtil{
    public static void main(String[] args) {
        //create a double array and assign 5 numbers
        double[] nums = {34.2, 10.4, 100.0, 1.2, 0.4, 89.5};
        System.out.println(Arrays.toString(nums));
        String myNums = Arrays.toString(nums);
        System.out.println("nums values = " + myNums);
        System.out.println(nums[0]);
        double d = nums[1];
        System.out.println("d = " + d);
        //char array, and assign YOUR name to the array.
        char[] myName = {'M', 'u', 'r','o','d','i','l'};
        System.out.println(Arrays.toString(myName));
        System.out.println(Arrays.toString(myName).toUpperCase());
        //string array. days = "Mon, Tue, Wed, Thur, Fri, Sat , Sun
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        //print days values in same line
        System.out.println( Arrays.toString(days) );
        System.out.println( Arrays.toString(days).toLowerCase() );
    }
}



