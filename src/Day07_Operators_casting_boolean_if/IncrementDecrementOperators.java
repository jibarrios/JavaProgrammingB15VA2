package Day07_Operators_casting_boolean_if;

import java.sql.SQLOutput;

public class IncrementDecrementOperators {
    public static void main(String[] args){
        int myNumber = 100;
        System.out.println("My number: "+ myNumber);
        myNumber++;
        System.out.println("My number: "+ myNumber);
        ++myNumber;
        System.out.println("My number: "+ myNumber);
        // each time adding only one
        myNumber++; myNumber++; myNumber++;
        // , can only be use only declaring the variable
        System.out.println("My number: "+ myNumber);
        ++myNumber;
        myNumber++;
        ++myNumber;
        System.out.println("My number: "+ myNumber);

        int booksToRead = 5;
        System.out.println("Books to Read: " + booksToRead);
        --booksToRead;
        System.out.println("Books to Read: " + booksToRead);

        booksToRead--;
        --booksToRead;
        System.out.println("Books to Read: " + booksToRead);
        booksToRead--;
        --booksToRead;
        booksToRead--;
        System.out.println("Books to Read: " + booksToRead);

        char letter = 'A';
        System.out.println("Letter:" + letter);
        letter++;
        System.out.println("Letter: " + letter);

        ++letter;
        ++letter;
        System.out.println("Letter: " + letter);
        // only printed the first line but you need other
        // (System.out.println("Letter" + letter); for the other one
        char myChar = '!';
        myChar++;
        System.out.println("My Char: "+ myChar);
        // behind every char there is number behind it
        myChar+= 10;
        System.out.println("My Char: "+ myChar);

        int num1 = 3;
        int num2 = ++num1;
        // ++num1 runs first than is assigned to num2 a
        // also now num1 has become 4 so both are 4
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);





    }
}
