package day56_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("BEFORE TRY CATCH");
        try {
            System.out.println("In try block");
            int result = 10 / 0;
            System.out.println("After 10/0 line");
        }catch (ArithmeticException e){
            System.out.println("Exception happened and was handled");
        }
        System.out.println("After TRY CATCH");

        try{
            System.out.println("In 2nd Try Block");
            String str = "Java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in try block and caught!");
        }
        System.out.println("After 2nd Try Catch");
    }
}
