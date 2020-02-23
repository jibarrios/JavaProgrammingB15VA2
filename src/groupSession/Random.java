package groupSession;
import java.util.*;
public class Random {
    public static void main(String[] args) {
        Random rd = new Random();

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i =0; i<50; i++){
            //nums.add(rd.nextInt(11));
        }
        System.out.println(nums);
        nums.removeAll(Arrays.asList(1,2));
        System.out.println(nums);
    }
}
