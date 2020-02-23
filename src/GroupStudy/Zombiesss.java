package GroupStudy;
import java.util.*;
public class Zombiesss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        for(int i = 1; i <= inhabitants;){
            System.out.println("Day " + day + " [" + inhabitants + "] ");
            inhabitants /=2;
            day++;
        }
        System.out.println("---- EXTINCT ----");

    }
}
