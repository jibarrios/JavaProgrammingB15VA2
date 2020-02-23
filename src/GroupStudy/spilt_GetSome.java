package GroupStudy;
import java.util.*;
public class spilt_GetSome {
    public static void main(String[] args) {
        int num = 545655;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = (num) / 10;
        }
        System.out.println(sum);
    }
}
