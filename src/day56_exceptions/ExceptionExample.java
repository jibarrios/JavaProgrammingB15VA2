package day56_exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 online Friends!");
           //int num = 2.5; Compile Error
        int[] nums = new int[3];
        nums[0] =  55;
        nums[1] = 56;
        nums[2] = 100;
        //nums[3]= 200; // run time Error


        System.out.println("bye bye B15 Online");// this wont run util line 11 is removed
        // Error that shows is:  Index 3 out of bounds for length 3 at day56_exceptions

        //int result = 10/0;//ERROR MSG: ArithmeticException: / by zero at day56_exceptions
        //System.out.println("Result is " + result);
    }
}
