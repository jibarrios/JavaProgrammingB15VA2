package Day37_Arrayslist;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
public class SortList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(100, 45,200,1,-30,0));
        System.out.println("nums before sorting = " + nums);


        Collections.sort(nums);
        System.out.println("nums after sorting = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after sorting reverse = " + nums);

        List<Character> charList = new ArrayList<>(Arrays.asList('k','a','n','3','-'));
        System.out.println("charList before sort = " + charList);


        Collections.sort(charList);
        System.out.println("charList after sort = " + charList);





    }

}
