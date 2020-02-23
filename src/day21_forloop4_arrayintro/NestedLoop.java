package day21_forloop4_arrayintro;

public class NestedLoop {
    public static void main(String[] args) {
        for(int outer=1; outer <= 5; outer++){
            for(int inner =0 ; inner <= 9; inner++){
                System.out.print(inner + " ");
            }
            System.out.println();
        }
    }
}
