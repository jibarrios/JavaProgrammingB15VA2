package day57_exceptions2;

public class TryCatchFinally {
    public static void main(String[] args) {

        System.out.println("Before Try Catch");

        try{// protects code
            System.out.println("Hello from Try Block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e) {
            System.out.println("Exception was caught and handled");

        }
        System.out.println("After Try Catch");

        try{// protects code
            System.out.println("Hello from Try Block");
            String str = null;
            System.out.println(str.length());
        }catch(Exception e) {
            System.out.println("Exception was caught and handled");

        }finally {// code that you want to run no matter if there is an exception or not
            System.out.println("Finally Block Runs!!");
        }
    }
}
