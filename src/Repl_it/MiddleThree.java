package Repl_it;
import java.util.*;
public class MiddleThree {
    public static void main(String[] args) {
        String word = "FuckCarlos";
        if(word.length() % 2 ==0 && word.length() >=5 ){
            System.out.println(word.substring(word.length()/2 -1,word.length()/2+2));
        }
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter price in cents:");
//        int itemPrice = scan.nextInt();
//        int quarter,dimes, nickles;
//
//        if(itemPrice <25 && itemPrice>100){
//            System.out.println("invalid price");
//        }else if(itemPrice % 5 != 0){
//            System.out.println("invalid price");
//        }else{
//            int change = itemPrice % 5;
//
//        }
        String word2 = "@@";

        if(word2.length()%2 != 0 && word2.length() >= 3){
            System.out.println(word2.substring(word2.length()/2,word2.length()/2+1));
        } else if(word2.length()%2 != 0 && word2.length() == 1) {
            System.out.println(word2 + word2 + word2);
        }else if(word2.length()%2 == 0 && word2.length()>= 4) {
            System.out.println(word2.substring(word2.length() / 2-1, word2.length()/2+1));
        }else if(word2.length()==2){
            System.out.println(word2+word2);




        }



    }
}
