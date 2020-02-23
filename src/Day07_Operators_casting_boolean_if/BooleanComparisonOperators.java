package Day07_Operators_casting_boolean_if;

import java.sql.SQLOutput;

public class BooleanComparisonOperators {
    public static void main(String[] args){
        System.out.println(10 > 5);
        System.out.println(10>11);
        System.out.println(10>10);

        System.out.println(88 >= 77);
        System.out.println(99 >= 99);
        System.out.println(100 >= 119);


        System.out.println(5 < 7);
        System.out.println(15 < 7);

        System.out.println(10 <= 15);
        System.out.println(10 <=10);
        System.out.println(10<=1);

        System.out.println(100 == 100);//when doing this way
        // 100= 100  it display error

        System.out.println(5 != 5);//
        System.out.println(10 !=100);

        int num1 = 100;
        int num2 = 200;
        System.out.println(num1 > num2);
        System.out.println(num1 == num2);

        System.out.println(num1 > num2);
        System.out.println(num1 <num2);

        System.out.println(num1 !=num2);

        boolean b1 = 123 >100;
        System.out.println("b1: "+ b1);
        int currentSpeed = 60;
        int speedLimit = 55;
        boolean overLimit = currentSpeed >speedLimit;
        boolean overLimit2 = speedLimit > currentSpeed;
        System.out.println("overLimit: " + overLimit);
        System.out.println("overLimit2: " + overLimit);

        boolean underOrAtLimit = currentSpeed <= speedLimit;
        System.out.println("under or at the limit: " + speedLimit);
        boolean atExactLimit = currentSpeed == speedLimit;
        System.out.println("At exact limit: " + atExactLimit);

        double balance = 150;
        boolean broke = balance <=0.0 ;
        System.out.println("AM I broke? - " + broke);

        double bag = 120.0;
        broke = (balance - bag)<= 0.0;
        System.out.println("Just got a Bag, am i broke?: " + broke);

        char letter1 = 'A';
        char letter2 = 'B';
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);
        System.out.println(letter1 != letter2);

        System.out.println("wooden spoon" == "wooden spoon");
        String str = "java";
        System.out.println(str == "java");
        System.out.println(str != "java");

        int num = 100;
        if(num> 50) {
            System.out.println("num1 is greater than 50");
        }else{
            System.out.println("num1 is not greater that 50");

        }







    }
}
