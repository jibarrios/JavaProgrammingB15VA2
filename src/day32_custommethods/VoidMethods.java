package day32_custommethods;

public class VoidMethods {
    public static void main(String[] args) {
        countFrom1to10();
        countFrom1to10();
        System.out.println();
        System.out.println("----- English Alphabet------");
        printAtoZ();
        icanDoIt();
    }
    public static void countFrom1to10() {
        for (int i = 1; i <= 10; i++) {

            System.out.print(i + " ");
        }
        }
        public static void printAtoZ() {
            for (char letter = 'A'; letter <= 'Z' ; letter++) {

                System.out.print(letter + " ");
            }
        }
        public static void  icanDoIt(){
            System.out.println();
            for (int i = 0; i <=300 ; i++) {
                System.out.print("Java is fun! I can do it!  |");



            }
        }


    }
