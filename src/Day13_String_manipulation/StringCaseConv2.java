package Day13_String_manipulation;

public class StringCaseConv2 {
    public static void main(String[] args) {
        String word = "Cybertek School";
        // print the word in all upper case
        System.out.println(word.toUpperCase());
        //convert word to all upper case and store into u word variable
        String uWord = word.toUpperCase();
        System.out.println("uWord = " + uWord);
        //print 
        System.out.println("word = " + word);

        word = word.toUpperCase();
        System.out.println("word is now = " + word);

        String lWord = word.toLowerCase();
        System.out.println("lWord = " + lWord);
        // check if lword is "cybertek school"
        if (lWord.equals("cybertek school")){
        System.out.println("lWord is all lowercase");
    }else{
            System.out.println("lWord is not all lowercase or does not match!");
        }

    }
}
