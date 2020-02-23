package PracticesCoding;
import java.util.*;
public class JavaXX {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.length() < 4) {
            System.out.println(exists);
        } else if (word.startsWith("java")) {
            System.out.println(!exists);
        } else if (word.startsWith("java", 1)) {
            // first insert String then where you want it to start from
            System.out.println(!exists);
        } else {
            System.out.println(exists);

        }
    }
}
