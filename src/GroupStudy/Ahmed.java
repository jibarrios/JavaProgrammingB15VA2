package GroupStudy;
import java.util.*;
public class Ahmed {
    public static void main(String[] args) {
        //Switch the values

        int a = 4;
        int b = 8;
        a= a+b; //12
        b= a-b; // a (12)- b(8)= 4
        a=a-b; // a(12)-b(4)= 8

        System.out.println(a);
        System.out.println(b);



        for(int outer = 0; outer< 4; outer++ ){
            System.out.println(outer + "... outer loop");
            for(int inner = 0; inner < 10; inner ++) {
                System.out.println(inner + "... inner");
            }
        }

        int i = 0;
        while(i < 5){
            i++;
        }
        String str = "java";
        int index = str.indexOf("a"); // --> 1
        System.out.println(str.indexOf("a", index+1));
        // if your looking for the second letter first you find the first index and + 1 so you can find the
        //second letter (index)


        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        String str2 = Arrays.toString(arr);
        System.out.println(str2);




    }
}
