package PracticesCoding;

public class task3 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 4;
        int n3 = 3;

        if(n1>n2 && n1> n3){
            System.out.println(n1 + " is the largest number!");
        }if(n2>n1 && n2>n3){
            System.out.println(n2 + " is the largest number!");
        }if(n3> n1 && n3> n2){
            System.out.println(n3 + " is the largest number!");
        }
    }
}
