package Day07_Operators_casting_boolean_if;

public class PrePostIncrementDecrement {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = ++num1;
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        int j1 = 4;
        int j2 = j1++;
        //since the ++ is after the variable doesn't apply the +1
        //assign current value to j2 and then add the +1 to j1
        // which why j1 printed out 5 and not 4
        System.out.println("j1: " + j1);
        System.out.println("j2: " + j2);






    }
}
