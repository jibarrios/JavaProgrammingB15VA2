package Day37_Arrayslist;
import java.util.*;
public class ArrayListComparison {
    public static void main(String[] args) {
        List<Double> nums1 = new ArrayList<>();
        nums1.add(1.2);
        nums1.add(5.2);
        nums1.add(7.5);
        nums1.add(8.0);
        nums1.add(52.5);

        List<Double> nums2 = nums1;

        System.out.println(" nums1 == num2 - " + (nums1 == nums2));

        System.out.println(nums1);
        System.out.println(nums2);


        nums1.add(100.0);
        System.out.println(nums1);
        System.out.println(nums2);

        List<Double> nums3 = new ArrayList<>();
        nums3.add(1.2);
        nums3.add(5.2);
        nums3.add(7.5);
        nums3.add(8.0);
        nums3.add(52.5);
        nums3.add(100.0);

        System.out.println("num1 -> " + nums1.toString());
        System.out.println("nums3 -> " + nums3.toString());

        System.out.println("nums1 == nums3 - " + (nums1 == nums3));
        System.out.println("nums1.equals(nums3) - " + (nums1.equals(nums3)));

        System.out.println("nums2.equals(nums3) - " + (nums2.equals(nums3)));

        List<Integer> listA = new ArrayList <>();
        listA.add(30);
        listA.add(10);
        listA.add(11);

        List<Integer> listB = new ArrayList <>();
        listB.add(30);
        listB.add(10);

        System.out.println("listA == listB > " + (listA == listB));
        System.out.println("listA.equals(listB) > " + listA.equals(listB));
        System.out.println("listA.containsAll(listB) > " +listA.containsAll(listB));


        listA.removeAll(listB);// removes all Values that listB has from
        // listA
        System.out.println("listA -> "+ listA);
        System.out.println("listB -> "+ listB);

    }
}
