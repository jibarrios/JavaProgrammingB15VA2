package day09_multibranch_switch;

public class CalculatorV2Switch {
    public static void main(String[] args){
        double num1 = 5.0;
        double num2= 3.0;
        char operator = '+';
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;// exit switch statement
            case'-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case'/':
                System.out.println(num1 / num2);

            default:
                System.out.println("invalid operator");



        }

    }
}
