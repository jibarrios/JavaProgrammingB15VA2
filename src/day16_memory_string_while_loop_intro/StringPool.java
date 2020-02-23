package day16_memory_string_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java";//String pool
        String word2 = "java"; // String pool re- use
        String word3 =  new String("java"); // outside pool, in heap


        System.out.println(word1 == word2);// True both are pointing to same object in the pool
        System.out.println(word1== word3); // false b/c word1 & word3 are seprate part of memory
        // when we use ==, it does not check if value are matching
        // it only checks if variables are pointing to same object in memory
        // only checks if variables are pointing to same object
        String word4 = new String("java");
        System.out.println(word3 == word4);

        String word5 = word4;// under the same objects word4
        System.out.println(word4 == word5); // false different objects in memory
        System.out.println(word1.equals(word4)); // true values match

        String str = "macbook"; // String pool HEAP
        String str2 = "macbook";//
        String str3 = str;//




    }
}
