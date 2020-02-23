package Review_Basics101;

public class Reverse {
    public static void main(String[] args) {

        String word = "apple";


        if (word.length() == 5) {
            for (int i = 5; i < word.length() - 1; i--) {
                System.out.println(word);
            }
        } else if (word.length() < 5) {
            System.out.println("Too short!");

        } else if (word.length() > 5) {
            System.out.println("Too long!");

        }

    }
}
