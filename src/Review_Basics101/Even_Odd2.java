package Review_Basics101;

public class Even_Odd2 {
    public static void main(String[] args) {

        String num2 = "";

        for(int n = 1; n <= 100; n++){
            if(n % 2 == 0 && n<100){
                System.out.print(n + ", ");
            }
            if(n == 100){
                System.out.print(n);

            }
        }
        System.out.println();
        for (int j = 1; j < 100; j++) {
            if(j % 2 != 0){
                System.out.print(j + ", ");
            }
            if(j == 99){
                System.out.print(j);
            }

        }
    }

}
