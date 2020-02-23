package day17_while_do_While_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws Exception { // apart the slow down code
        // 1 2 3 4 5 6 7 8 9 10
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " "); //if we do println, it would print down instead or this way
            count++;
            Thread.sleep(500); // slows it down

        }
        System.out.println();//  to be able to print out on the line under
        // if (count <= 10) {
        //  System.out.print(count + " "); print out 2
        //  count++;
        int count2 = 10;
        while(count2 <= 10 && count2 >0){ // or count2 >=1
            System.out.print( count2 +" ");
            count2--;

        }

    }
}
