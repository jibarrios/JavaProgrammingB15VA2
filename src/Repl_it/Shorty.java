package Repl_it;
import java.util.*;
public class Shorty {
    public static void main(String[] args) {
        String str = "Hello our app friend will get some coffee";
        String[] arr = str.split(" ");

             int min = arr[0].length();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i].length()< min){
                min = arr[i].length();

            }
        }
        Arrays.sort(arr);
        String shortest = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() == min){
                shortest+=arr[i] + " ";


            }

        }
        System.out.println(shortest);



    }
}