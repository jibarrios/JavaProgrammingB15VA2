package Day06_Opertors;

public class CentsToDollars {
    public static void main(String[] args){
        int cents = 220;
        int dollars = cents/100; // this only display w/o remainder
        int remainingCents = cents % 100; // this only displays reminder
        System.out.println(dollars + " dollars" + " and " + remainingCents + " cents");
        //use sout as a Shortcut to print out = System.out.println()



    }
}
