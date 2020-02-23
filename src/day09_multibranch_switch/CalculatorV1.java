package day09_multibranch_switch;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 30.0;
        char operator = '*';

        if (operator == '+') {
            System.out.println(num1 + num2);

        } else if (operator == '-') {
            System.out.println(num1 - num2);

        } else if (operator == '*') {
            System.out.println(num1 * num2);

        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }
    }
}
