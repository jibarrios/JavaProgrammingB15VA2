package day16_memory_string_while_loop_intro;

public class StringPractices {
    public static void main(String[] args) {
        String word = "abc"; // always three characters
        String reversed = "";

        /*
        read third letter from word & concatenate to reversed second letter from word
        and concatenate to reversed. read first letter from word and  concatenate to reversed
         */

        System.out.println(word.charAt(2));
        reversed += word.charAt(2);
        System.out.println("reversed = " + reversed);


        reversed += word.charAt(1); //cba
        System.out.println("Reversed = " + reversed);

        reversed += word.charAt(0); //cba
        System.out.println("Reversed = " + reversed);


        String reversed2 = "";
        reversed2 += reversed2 + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("reversed2 = " + reversed);

        System.out.println("" + word.charAt(2) + word.charAt(1) + word.charAt(0));


        if (word.equals(reversed)) {
            System.out.println("palindrome 3 letter word");
        }
        System.out.println(" not palindrome letters");
    }

}
