package day35_MoreMethodPractices;

public class ReCurion {
    public static void main(String[] args) {
        printName(5);

    }
/*
    Recusive Method w/out end termimate condition
 */
   public static void  printName(int num) {
       System.out.println(num);

    }
    public static void printNumGood(int nums){
        if( nums>0){
            printName(nums-1);
        }else{
            return;
        }

    }
}
