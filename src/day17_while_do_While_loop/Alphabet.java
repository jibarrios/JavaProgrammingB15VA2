package day17_while_do_While_loop;

import org.w3c.dom.ls.LSOutput;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';

        while(letter<= 'z') {
            System.out.print(letter + " ");
            letter++;
        }

        System.out.println();

        char letter2 ='Z';

        while(letter2 >='A'){
            System.out.print(letter2 + " ");
            letter2--;
        }
        System.out.println();


        char myLetter = 'A';
        String alphabet= "";

        while(myLetter<= 'z') {
            alphabet += myLetter;
            System.out.println(alphabet);
            myLetter++; //?
        }


    }
}
