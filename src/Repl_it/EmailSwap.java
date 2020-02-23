package Repl_it;

public class EmailSwap {
    public static void main(String[] args) {
    String email = "Juliza_Barrios@gmail.com";
        if(email.contains("_")) {
            String p1 = email.substring(0, email.indexOf("_"));
            String p2 = email.substring(email.indexOf("_")+1,email.indexOf("@"));

            String email1 = (p2 + "_" + p1 + "@gmail.com");

            System.out.println(email1);
        }
        int count = 10;
        while(count >= 1){
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        char letter = 'z';

        while(letter>='a'){
            System.out.print(letter +" ");
            letter--;
        }

    }
}
