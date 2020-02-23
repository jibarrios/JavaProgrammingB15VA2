package day15_string_manipulation;

public class SubString {
    public static void main(String[] args) {
        String word = "java is fun";
        // print java only
        System.out.println(word.substring(0,4));// put the position
        // after the character you need
        System.out.println(word.substring(5,7));
        System.out.println(word.substring(8,11));

    }
}
