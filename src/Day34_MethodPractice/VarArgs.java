package Day34_MethodPractice;

import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
        sum(20);
        sum(23,43);
        sum(34,54,64,34,234,32);
    }



    public static void sum(int ... nums){
        System.out.println("index 0: " + nums[0]);
        System.out.println(Arrays.toString(nums));
    }
}
