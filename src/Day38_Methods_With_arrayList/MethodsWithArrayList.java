package Day38_Methods_With_arrayList;
import java.util.*;

public class MethodsWithArrayList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(15);
        nums.add(52);
        nums.add(25);
        nums.add(55);
        nums.add(53);
        nums.add(5);
        nums.add(501);
        nums.add(57);
        nums.add(85);
        printList(nums);


        List<Integer> nums2 = new ArrayList<>();
        nums2.add(4);
        nums2.add(10);
        nums2.add(6);
        System.out.println("Before doubling: " + nums2.toString());

        doubleTheList(nums2);
        System.out.println("After doubling: " + nums2.toString());

        System.out.println("Nums before doubling: " + nums.toString());
        doubleTheList(nums);
        System.out.println("Nums after doubling: " + nums.toString());

        System.out.println("Nums2 sum: " + sumList(nums2));
        System.out.println("Nums Sum: " + sumList(nums));
    }
       /*
       Methods: printList
       Params:List<Integers>
       Returns: Void
       Print each Value in same Line by space
       listA = [4,2,3]
       printList(listA); => Print 423
        */

    public static void printList(List<Integer> list) { // the last list is variable
        // that can be changed
        for (Integer iEach : list) {
            System.out.print(iEach + " ");
        }
        System.out.println();// go to new line
    }
public static int sumList(List<Integer> nums){
       int sum = 0;
       for (int eachNum : nums) {
           sum += eachNum;
       }
       return sum;

        }
           public static void doubleTheList(List <Integer> nums){
               for (int i = 0; i < nums.size(); i++) {
                   int temp = nums.get(i);
                   temp = temp *2;
                   nums.set(i,temp);
                   //nums.set(i,nums.get(i)* 2 ); one line  for above 3 line

               }
           }


}
