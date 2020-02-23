package day32_custommethods;

public class SimpleMethod {
    public static void main(String[] args) {
        System.out.println("Hello from main method ");
        displayMessage();// call/use the custom method
        displayMessage();
        System.out.println("back from main method ");
    }

    public static void displayMessage() {
        System.out.println("hello World from my method!!");

    //whatever in method body -> w/in {code}, that code will run when you call the method
    // we can call the method multi times, since it is  reusable

    }
}
