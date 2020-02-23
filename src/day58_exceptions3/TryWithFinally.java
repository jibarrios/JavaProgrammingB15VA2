package day58_exceptions3;

public class TryWithFinally {
    public static void main(String[] args) {
        //Don't try use it in real coding, Where they pay you
        try{
            System.out.println("IN Try block....");
            System.out.println(9/0);
        }finally {
            System.out.println("In finally block. run always");
        }
        System.out.println("After try finally....");
    }
}
