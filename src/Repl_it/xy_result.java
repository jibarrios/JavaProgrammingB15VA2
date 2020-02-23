package Repl_it;

public class xy_result {
    public static void main(String[] args) {
        results a = new results();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2

    }
}
