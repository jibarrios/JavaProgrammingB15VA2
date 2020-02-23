package Day25_Arrays04_split;
import java.util.*;
public class ArraysSplit {
    public static void main(String[] args) {
        // create a string
        String words = "java,ruby,python,c++";
        // split the words by "," & assign to string[]
        String[] wordsArray = words.split(",");
        System.out.println("length of WordsArray " + wordsArray.length);
        System.out.println(wordsArray[0]);
        System.out.println(wordsArray[1]);
        System.out.println(wordsArray[2]);
        System.out.println(wordsArray[3]);

        System.out.println(Arrays.toString(wordsArray));

        String results = "About 117,000,000 results (1.33 seconds)";
        String [] googleArr = results.split(" ");

        System.out.println("googleArr length : " + googleArr.length);

        for(String item : googleArr) {
            System.out.println(item);
        }
        System.out.println("search result count: " + googleArr[1]);
    }
}
