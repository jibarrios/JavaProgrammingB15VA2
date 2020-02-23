package day17_while_do_While_loop;
import java.util.*;
public class FlipFlop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Words:");
        String code = scan.nextLine();

        System.out.println(code.indexOf(" ")); // just printed
        int spaceIdx = code.indexOf(" "); // declared it
        System.out.println(code.substring(0,spaceIdx));
        System.out.println(code.substring(spaceIdx +1));

        String code1 = code.substring(0,spaceIdx).toUpperCase();
        String code2 = code.substring(spaceIdx +1).toUpperCase();
        System.out.println(code2+" " +code1);

        String newWord = (code2+" " +code1);
        System.out.println("New Word = "+newWord);


    }
}
