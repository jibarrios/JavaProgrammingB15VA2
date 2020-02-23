package day12_ternary_string_manipultion;

public class TernaryOperator {
    public static void main(String[] args) {
        int num1= 55;
        int num2 = 100;

        int max = (num1 > num2) ? num1 : num2;
        System.out.println("max = " + max);// <== soutv then enter, print out the variable

        int score = 65;
        String result =(score >= 60) ? "pass" : "Fail";
        System.out.println("result = " + result);
        
        if(score >= 60){
            result = "pass";
        }else{
            result = "fail";
        }
        System.out.println("result = " + result);


    }
}
