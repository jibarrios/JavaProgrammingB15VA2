package Repl_it;

public class EEE {
    public static void main(String[] args) {
        String[] words = {"e", "hey", "bye", "furey", "spoon"};


        String wow = "Hello everyone, hello Amirjon";
        String[] are = wow.split(" ");


        String reversed = "";
        for (int i = are.length -1; i >= 0; i--) {
            reversed += are[i] + " ";

        }
        reversed = reversed.trim();//When you
        System.out.println(reversed);


    }
}

