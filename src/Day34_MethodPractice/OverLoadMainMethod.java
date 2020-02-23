package Day34_MethodPractice;

public class OverLoadMainMethod {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    /*

    overloading a main method
    -Same name
    -different parameter
    nut this new main method, is not what JDK
     */
    public static void main(int num) {
        System.out.println("num =" + num);

    }
}
