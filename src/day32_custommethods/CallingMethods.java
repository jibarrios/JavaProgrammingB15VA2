package day32_custommethods;

public class CallingMethods {
    public static void main(String[] args) {
        VoidMethods.countFrom1to10();
        System.out.println();
        VoidMethods.printAtoZ();
        VoidMethods.icanDoIt();
        displayUSFlags();


    }
    public static void displayUSFlags(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }





    }
}
