package day17_while_do_While_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        // print 1-10 using do while loop
        int n = 0;

        do{
            System.out.print(n + " ");
            n++;
        }while(n <=10);

        // 0-100
        // print even numbers

        System.out.println();
        int n2 = 0;
        do{
            System.out.print(n2+" ");
            n2+=5; // every two number (Even numbers)
        }while(n2<=50);



    }
}
