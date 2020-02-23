package day17_while_do_While_loop;

public class InitCap {
    public static void main(String[] args) {
        String word = "j";
        System.out.println(word.substring(0,1).toUpperCase());
        System.out.println(word.substring(1).toLowerCase());


        String inCap = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        System.out.println("inCap = " + inCap);

    }
}
