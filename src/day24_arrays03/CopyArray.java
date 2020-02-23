package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {
        int[] nums1 = {23, 55, 34, 87, 90, 123, 30};
        int [] nums2 = new int [nums1.length];

        System.out.println("num1 length: = " + nums1.length);
        System.out.println("num2  length: = " + nums2.length);

        // using for loop, read all values from num1 & assign
        for (int i = 0 ; i < nums1[i]; i++) {
            nums2[i] = nums1[i];
        }
        System.out.println();


    }
}
