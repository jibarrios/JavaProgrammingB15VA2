package Repl_it;

public class CommonEnd {
    public static void main(String[] args) {

    }
    public boolean commonEnd(int[] a, int[] b) {
        boolean answer = false;
        boolean first = a[0] == b[0];
        boolean second = a[a.length-1] == b[b.length-1];

        if(first || second){
            answer = true;
        }


        return answer;
    }

}
