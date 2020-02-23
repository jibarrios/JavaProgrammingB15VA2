package day09_multibranch_switch;

public class YesNo {
    public static void main(String[] args){
        char yn = 'Y'; // false 'N'
        boolean isAgreed;

        if(yn == 'Y'){
            isAgreed = true;

        }else{
            isAgreed = false;
        }
        System.out.println("Agreed is " + isAgreed);

    }
}
