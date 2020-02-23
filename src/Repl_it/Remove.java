package Repl_it;
import java.util.*;
public class Remove {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums.toString());

        nums.remove(0);
        System.out.println(nums.toString());
        nums.add(2);
        System.out.println(nums.toString());

        int temp = nums.get(1);
        System.out.println(temp);
        nums.remove(1);
        System.out.println(nums.toString());
        nums.add(temp);
        System.out.println(nums.toString());


    }
}
