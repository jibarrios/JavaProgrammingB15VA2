package Day18_forloop;

public class StartEnd {
    public static void main(String[] args) {
        int start = 6;
        int end = 13;

        //6,7, 8, 10, 11, 12, 13

        for (int n = start; n <= end; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (int n = 10; n >= 0; n--) {
            System.out.print(n + " ");
        }
        System.out.println();
        start = 4;
        end = 10;

        /* if start is less than end:
        print all the number between start & end
        ex) start= 5
            end = 8
            5 6 7 8
         if start is bigger than end:
        print all the number between end to start in reverse
         */
        if (start < end){
            for (int n = start; n <= end; n++) {
                System.out.print(n + " ");
            }
            }else{ // 25       20
            for (int n = start; n >= end; n--) {
                System.out.print(n + " ");
             }
        }
    }
}