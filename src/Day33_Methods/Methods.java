package Day33_Methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(getName());
        String myName = getName();
        System.out.println("myName = " + myName);

        String str = "java";
        System.out.println(str.length());

        int len = str.length();
        System.out.println(len);

        System.out.println(str.toUpperCase());
         
        String upper = str.toUpperCase();
        System.out.println("upper = " + upper);

        int wallet = giveMe5Dollars();
        System.out.println("how much in wallet? - $" + wallet);

        System.out.println(giveMe5Dollars());
       // System.out.println(fiveDollars());
        //int numm= fiveDollars();
        // can add anything the () b/c there is nothing in the new method!!! loook below 6__6

    }
    public static void fiveDollars(){
        int dollars = 5;
    }
    public static String getName() { // can only use one value (return )
        return"Juliza";


    }
     public static int giveMe5Dollars(){
        int dollar = 5;
        return dollar;
     }
    }

