package day15_string_manipulation;

import org.w3c.dom.ls.LSOutput;

public class StringReplace {
    public static void main(String[] args) {
        String words = "sad, cry, python";
        System.out.println(words.replace("sad", "happy"));
        System.out.println(words.replace("cry", "smile"));
        System.out.println(words.replace("python", "java"));
// Didnt reassign variable which why they went back to orginal statement
        words = words.replace("sad, cry, python", "happy, smile, java");
        System.out.println("words = " + words);
        
        // change "smile" to "SMILE"
        words= words.replace("smile", "SMILE");
        System.out.println("words = " + words);

        words =words.replace("happy, SMILE, java" , "happy:smile:java");
        System.out.println("words = " + words);

        words = words.replace(":", "|");
        System.out.println("words = " + words);

        String capital = "London is capital of UK";
        capital = capital.replace("London" , "washington DC");
        capital = capital.replace("UK", "USA");
        System.out.println("capital = " + capital);
        capital = capital.replace("washington DC", "Ankara").replace("USA", "Turkey");
        System.out.println("capital = " + capital);
    }
}
