package day16_memory_string_while_loop_intro;

public class MergeWord {
    public static void main(String[] args) {
        String str = "{[]}"; // always 4

        String word = "java";
        String merged = "{[java]}"; // TASK***
        System.out.println(str.substring(0,2) + word + str.substring(2));
        System.out.println("merged = " + merged);





    }
}
