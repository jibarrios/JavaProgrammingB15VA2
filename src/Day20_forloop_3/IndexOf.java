package Day20_forloop_3;

public class IndexOf {
    public static void main(String[] args) {
        String word = "Java is fun";
        // convert everything to lowercase
        word = word.toLowerCase();
        char letter = 'a';
        int index = -1;
        // position of a letter - assume not there & assign -1


        //loop through the word & compare each character to letter.
        //if it matches assign that loop variable value into index

        // outside the loop:  "a was found at index 1"
        for (int i = 0; i < word.length() ; i++) {
            //System.out.println(word.charAt(i));
            if(word.charAt(i) == letter){
                index = i;
                break;// exit the loop no need to read other chars
                //System.out.println(letter + " found at " + i );
            }

        }
        System.out.println(letter + " was found at index " + index);

    }
}
