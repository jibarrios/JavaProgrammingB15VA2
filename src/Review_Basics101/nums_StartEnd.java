package Review_Basics101;

public class nums_StartEnd {
    public static void main(String[] args) {
        int [] nums = {3,4,5,6,7,8};
        if(nums.length < 1){
            System.out.println("false");// you need to cover when scenario when there is only one
            //number automatically false b/c there is nothing to compare it too
        }
            if(nums[0] == 8 || nums[nums.length-1]==8){
                System.out.println("true");
        }else{
                System.out.println("false");
            }
    }
}
