package Day27_arrays06;

public class Encryption {
    public static void main(String[] args) {
        //0123456789...
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypted = "zyxwvutsrqponmlkjihgfedcba";

        String letter = "a";
        //encrypt letter
        //find the index of letter 'a' in alphabet
        //read character at same index from encrypted

        int idx = alphabet.indexOf(letter);// take a letter and character and tells you its location
        System.out.println("The Index of 'a' = " + idx);
        System.out.println(encrypted.charAt(idx)); // takes the index and gives the position
        System.out.println(letter + " => " + encrypted.charAt(idx));

        String word = "java";
        String encword = "";
        //ecrypt this. 4 letters in word

        char first = word.charAt(0);
        char second = word.charAt(1);
        char third = word.charAt(2);
        char fourth = word.charAt(3);

        int i1 = alphabet.indexOf(first);
        int i2 = alphabet.indexOf(second);
        int i3 = alphabet.indexOf(third);
        int i4 = alphabet.indexOf(fourth);

        char encr1 = encrypted.charAt(i1);
        char encr2 = encrypted.charAt(i2);
        char encr3 = encrypted.charAt(i3);
        char encr4 = encrypted.charAt(i4);

        encword = "" + encr1 + encr2 + encr3 + encr4;
        System.out.println("word = " + word);
        System.out.println("Encrypted word = " + encword);


        String word2 = "juliza";
        String encrypted2 = "";

        for (int i = 0; i < word2.length(); i++) {
            //1.read a letter from word2- index i
            char myLetter = word2.charAt(i);
            //2. Find the index of myLetter in alphabet
            int index = alphabet.indexOf(myLetter);
            //3. REad the letter at position index from encrypted. and store into char
            char enc = encrypted.charAt(index);
            //4. add enc to encrypted word
            encrypted2 += enc;
        }
        System.out.println("encrypted2 = " + encrypted2);
        // Task 3 declare word3 & assign some encrypted message assign'
        //Decrypt it!

        String word3 = "dllo";
        String decryptedWord = "";
        for (int i = 0; i < word3.length(); i++) {
            char myLetter2 = word3.charAt(i);
            int idxx = encrypted.indexOf(myLetter2);
            char dec = alphabet.charAt(idxx);
            decryptedWord += dec;

        }
        System.out.println("word3 = " + word3);
        System.out.println("decryptedWord = " + decryptedWord);



    }
}
