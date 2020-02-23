package Day34_MethodPractice;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(4, 3);

        sum(4, 5, 2);
        sum("hello", "10");

    }
    public static void sum(int num1,int num2){
        System.out.println("sum(int num1,int num2)");
        System.out.println("Result: " + num1 + num2);
    }
    public static void sum(int num1,int num2, int num3) {
        System.out.println("sum(int num1,int num2)");
        System.out.println("Result: " + num1 + num2 + num3);
    }
    public static void sum(String str1, String str2){
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result: "+(str1 + str2));
    }
    public static void sum(double num1, double num2, String str){
        System.out.println(str + (num1+num2));
    }
    public static void sum(double num1, String str, double num2){
        System.out.println(str + (num1+num2));
    }

}
