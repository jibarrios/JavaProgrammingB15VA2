package day35_MoreMethodPractices;
import java.lang.reflect.Array;
import java.util.*;
public class MethodWithReturnArrays {
    public static void main(String[] args) {
        getDays();
        System.out.println(getDays());//hashCodes

        String[] strArr = getDays();
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(getDays()));

        for(String day : getDays()){
            System.out.print(day + ", ");
        }
    }
    public static String[] getDays(){
        String [] days= {"mon", "Tues","Wed","Thur", "Fri", "Sat","Sun"};
        return days;



    }
}
