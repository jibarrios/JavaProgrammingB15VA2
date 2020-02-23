package day28_review;
import java.lang.reflect.Array;
import java.util.*;
public class FillArrayLoop {
    public static void main(String[] args) {
        int[] nums = new int[101];
        System.out.println(nums[0]);
        for (int i = 0; i <= 100; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));


        System.out.print("[");
        for(int i =nums.length-1;i>= 0;i--){
            System.out.print(nums[i] + " , ");
        }
        System.out.print("]");


    }
}
