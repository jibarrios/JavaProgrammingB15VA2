package day22_arrays_intro;

public class ArrayIntro {
    public static void main(String[] args) {
        // declare int arrays w/ size 4
        int[] nums = new int[4];
        // assign values to each index
        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 700;
        nums[3] = -5;
        //  nums[4] = 8; ArrayIndexOutOfBoundException
        // print first number in the array
        System.out.println(" Number at index 0 : " + nums[0]);
        System.out.println(" Number at index 1 : " + nums[1]);
        System.out.println(" Number at index 2 : " + nums[2]);
       int third = nums[3];
        System.out.println(" Number at index 3 : " + third );
        //System.out.println(nums[4]);
        int i = 0;
        System.out.println(nums[i]); // since i = 0 it works since we have nums[0]!!
        i++;
        System.out.println(nums[i]);//200

        //find out how many elements/ values
        System.out.println("Number of elements: " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //modify 0 to 222
        nums[0] = 222;
        System.out.println("Number to index 0 : " + nums[0]);
        // read value from index 1 & store onto index 2
        nums[2] = nums[1];
        System.out.println("nums[2] now is " + nums[2]);









    }
}
