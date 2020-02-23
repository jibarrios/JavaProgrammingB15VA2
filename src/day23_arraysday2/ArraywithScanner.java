package day23_arraysday2;
import java.util.*;
public class ArraywithScanner {
    // There are multiple teams each has score between 0-100.
    // create an array that can store scores of 5 teams
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] scores = new int [5];
        //byte,short, int, long --> 0
        // float, double
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter team " + (i + 1) + " scores: ");// i+1  change number
           scores[i] = scan.nextInt();
           // int score = scan.next.Int();
            // scores[i] = score; other way

        }
        for(int score : scores){
            System.out.print(score+ " ");
        }
        System.out.println();
        // find the Maz score 
        int max = 0;
        for (int i = 0; i < scores.length ; i++) {
            //System.out.println(scores[i]);
            if(scores[i] > max){
                max = scores[i];// started w/ 0 goes through the list and replaces
                // it the zero

            }
        }
        System.out.println("max = " + max);

        // find min = 0 ;
             int min= scores[0]; // assume first one is min & assign
        for (int num: scores ) {
              if(num < min){
                  min = num;
              }
        }
        System.out.println("min = " + min);
        }

    }

