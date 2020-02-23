package Review_Basics101;

public class Even_Odd {
    public static void main(String[] args) {
        int num = 100;
 String num1="";
        for (int i = 1; i <=100 ; i++) {
            if(i % 2 == 0&&i<100){
                System.out.print(i + ", ");
            } if(i==100){
                System.out.print(i);
            }
        }
        System.out.println();
        for (int j = 1 ; j < 100 ; j++) {
            if(j % 2 != 0){
                num1+=j+", ";
                System.out.print(j + ", ");
            }


        }
        System.out.println();
        System.out.println("num1 = " + num1.substring(0,num1.length()-2));
    }
}
