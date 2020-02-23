package Day18_forloop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {
        //1-100 all even
        // all odd
        int n = 100;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
            System.out.println();
            for (int num = 1; num <= 100; num++) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }





        }
    }
