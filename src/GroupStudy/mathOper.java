package GroupStudy;
import java.util.*;
public class mathOper {
    public static void main(String[] args) {
        int[] nums = {8, 2, 3, 4, 5, 6, 9};
        int max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
        int min = nums[0];
        for (int n = 0; n < nums.length; n++) {
            if(nums[n] < min) {
                min = nums[n];
            }
        }
        System.out.println(min);

        int sum = 0;
        for (int j = 0; j < nums.length ; j++) {
            sum+=nums[j];
        }
        System.out.println(sum);


        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / 2;
        }
        System.out.println(Arrays.toString(nums));

        String str = "Juliza";
        String f1 = str.substring(0, str.length());
        String sw = str.substring(0,2);

        System.out.println(f1);
        System.out.println(sw);
    }
}
