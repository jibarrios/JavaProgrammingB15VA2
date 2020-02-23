package PracticesCoding;
import java.util.*;
public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size: ");
        double screensize = scan.nextDouble();
        if(screensize == 13.3) {
            price += 200;

        }else if(screensize ==15.0) {
            price += 300;

        }else if(screensize == 17.3){
                price+=400;

            System.out.println("Select CPU type:");
            cpu = scan.next();
            switch(cpu) {
                case "i3":
                    price += 150;
                    break;
                case "i5":
                    price += 250;
                    break;
                case "i7":
                    price += 350;
                    break;
            }
                System.out.println("Select RAM type:");
                ram = scan.nextInt();
                if(ram%4==0){ // why
                    price= price + (ram/4)*50;

                }

                }



        }
        }
