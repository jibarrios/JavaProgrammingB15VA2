package Day19_forloop_2;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 5;

        // check if number is Valid (1-10)

        //if # is less than 1 or more than 10 print ERROR; invalid input
        // return to STOP LOOP
        // inside the loop:
        // int result = multiply # by loop variable
        // Ex: 1x Number(2) = Result(2)
        //    2x Number(2) = Result(4)

        if (number < 1 || number > 10) {
            System.out.println(" ERROR: invalid input ");
            return; // system.exit(status :0); powerful version of stop
        }
        for(int n = 1; n<= 10; n++){
            int result = n * number;
            System.out.println(n + " X "+ number + " = " + result);


        }

    }
}
