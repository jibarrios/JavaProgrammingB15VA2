package Repl_it;

public class Nested_loops {
    public static void main(String[] args) {
        int j = 1;
        int i = 1;

        int n = 6;
        for (i = 1; i <= n; i++) {
            String star = "";
            for (int k = j; k <= i; k++) {
                star +="*";
            }
            System.out.println(star);
        }


        int k = 1;
        int t = 1;
        int m = 5;

        for (int l = k; l <= m ; l++) {
            for (int d = t; d <= l; d++) {
                System.out.print("$");

            }
            System.out.println();

        }


    }



            }


