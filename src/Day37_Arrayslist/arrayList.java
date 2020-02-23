package Day37_Arrayslist;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<Integer>nums =Arrays.asList(10,40, 12, 5, 7);
        System.out.println("nums = " + nums);

        //nums.add(2);
        //System.out.println("nums = " + nums);
        //You can not remove/add (modify the list) when using this shortCut 

        List<Integer>nums2 = new ArrayList(Arrays.asList(10,40, 12, 5, 7));
        System.out.println("nums2 = " + nums2);
        nums2.add(34);
        nums2.add(55);
        System.out.println("nums2 = " + nums2);
        
        
        nums2.remove(0);
        System.out.println("nums2 = " + nums2);

    }
}
