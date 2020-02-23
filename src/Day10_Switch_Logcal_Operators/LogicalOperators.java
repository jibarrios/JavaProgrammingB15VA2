package Day10_Switch_Logcal_Operators;

import java.util.function.DoubleToIntFunction;

public class LogicalOperators {
    public static void main(String[] args) { // main then enter
        int apples = 10;
        int oranges = 20;
        System.out.println("#### TRUE TABLE FOR && OPERATOR ###");
        System.out.println("True && True is " + (true && true));
        if(apples == 10 && oranges == 20){
        System.out.println("Condition is True ");
    }else {
            System.out.println("condition is False ");
        }
        System.out.println("False && true is: "+ (false && true));

        if(apples > 100 && oranges == 20){
            System.out.println("Condition is True ");
        }else {
            System.out.println("Condition is False ");

        } System.out.println("True && False is: "+ (true && false));

        if(apples == 10 && oranges <20){
            System.out.println("Condition is True ");
        }else {
            System.out.println("Condition is False ");
        } System.out.println("False && false is: "+ (false && false));

        if(apples > 100 && oranges < 20){
            System.out.println("Condition is True ");
        }else {
            System.out.println("Condition is False ");
        }



    }
}
