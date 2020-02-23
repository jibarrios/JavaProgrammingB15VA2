package Day19_forloop_2;

public class LoopFizzBuzz {
    public static void main(String[] args) {
        for(int l = 0; l <= 100; l++){
            if(l % 3 == 0 && l % 5 == 0 ){
                System.out.println(l + "is FizzBuzz ");

            }else if (l %3 == 0){
                System.out.println(l +" is Fizz");

            }else if( l % 5 == 0) {
                System.out.println(l + " is Buzz");
            }

        }

    }
}
