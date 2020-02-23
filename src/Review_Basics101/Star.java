package Review_Basics101;

public class Star {
    public static void main(String[] args) {


        String str = "*" ;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(str);

            }
            System.out.println();
        }
        String letter = "";
        for(int n = 1; n <=4; n++){
            letter+= "$";
            System.out.println(letter);
        }

    }
}