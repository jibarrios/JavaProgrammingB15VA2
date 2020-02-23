package Day25_Arrays04_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        //Find out how many words are in the sentences & print
        // there are 3 words find the space
        String [] words = sentence.split(" ");
        System.out.println("Number of words: " + words.length);

        // print everything in same line
        // 2nd loop everything in reverse order

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        String reversed = "";
            for (int j = words.length-1; j >= 0; j--) {
                System.out.print(words[j] + " ");
                reversed += words[j] + " ";
            }
        System.out.println("\nreversed = " + reversed.trim()); // removes space in end or start
            }

        }


