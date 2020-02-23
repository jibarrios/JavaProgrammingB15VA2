package day16_memory_string_while_loop_intro;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num = 1;
        //while(num<= 10){  <-- INFINITE LOOP
          //  System.out.println("Hello World!");
        while(num<= 10){
            System.out.println("Hello World!");
            num++;
        }
        //create a variable steps & assign 1 to it.
        // write a while loop to repeat 100 times:
        // each time print "taking a step 2"
        int steps = 1;

        while(steps <= 100){
            System.out.println("taking a step " + steps);
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
