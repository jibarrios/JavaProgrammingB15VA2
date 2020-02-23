package day57_exceptions2;

public class RunTimeErrorDemo {
    static int num = 0;
    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        //Call main method again
        main( null);
    }
}
