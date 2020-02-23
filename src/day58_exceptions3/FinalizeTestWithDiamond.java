package day58_exceptions3;

import day54_Polymorism.Diamond;

public class FinalizeTestWithDiamond {
    public static void main(String[] args) {
       // while (true) {

            Diamond d1 = new Diamond();
            Diamond d2 = new Diamond();
            Diamond d3 = new Diamond();


            d1 = null;
            d2 = null;
            d3 = null;

            System.gc(); // invited or suggest GC to do clean up

       // }
    }
}
