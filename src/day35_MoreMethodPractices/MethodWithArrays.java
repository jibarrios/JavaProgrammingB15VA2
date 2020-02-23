package day35_MoreMethodPractices;

public class MethodWithArrays {
    public static void main(String[] args) {
        int[] myNums = {3, 1, 4, 55, 6, 9, 3};
        printArray(myNums);
        printArray(new int[]{34, 10, 33, 55});
        System.out.println(has10(new int[]{3,4,5,10,1}));
        System.out.println(has10(new int[]{3,4}));

        boolean check = longerThan3(new double[]{23.1, 45.5, 22.4, 44.5});
        System.out.println("check = " + check);
    }
    //BREAK TILL 3:33
    /*
    Method: longerThan3
    Input/Param: double[] nums
    return: boolean
    returns true if arrays length is more than 3, false otherwise
    longerThan3(new double[]{3.1, 4.2, 5, 2}); => true
    longerThan3(new double[]{3,4}); => false
     */
    public static boolean longerThan3(double[] nums){
        return nums.length > 3;

       /* if (nums.length > 3){
            return true;
        }
        return false;
        */

        /*
        if(nums.length > 3){
            return true;
        }else{
            return false;
        }
        */
    }
    /*
    Method: printArray
    arg/param: int[] nums
    return: void
    print each item in the array in separate lines
     */
    public static void printArray(int[] nums){
        for(int eachNum : nums){
            System.out.println(eachNum);
        }
    }
    /*
    Method name: has10
    Params: int[] nums
    return: boolean
    Returns true if there is 10 anywhere in the array , returns false if not
     */
    public static boolean has10(int[] nums){
        for(int eachNum :  nums){
            if(eachNum == 10){
                return true;
            }
        }
        return false;
    }
//    public static boolean has10(int[] nums){
//
//        boolean found = false;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 10){
//                found = true;
//                break;
//            }
//        }
//
//        return found;
//    }
}








