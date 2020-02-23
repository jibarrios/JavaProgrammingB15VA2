package day58_exceptions3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("file.csv");

    }catch (FileNotFoundException e) {
            System.out.println("FileNotException is Caught/ Handled");
            e.printStackTrace();
        }
        System.out.println("AFTER TRY CATCH.... ");


    try{  // <= ShortCut = Command+Alt+T, 6

        int[] nums = {23,12,54};// can add other number to void the exception
        System.out.println(nums[0]);
        System.out.println(nums[2]);
        //if(nums.length> 3) {  <- also can add condition to void
        System.out.println(nums[3]);//<- Unchecked Exception
        }catch (ArrayIndexOutOfBoundsException e ) {
        System.out.println("ArrayIndexOutOfBoundsException");
    }
        System.out.println("After Array");



    }
}
