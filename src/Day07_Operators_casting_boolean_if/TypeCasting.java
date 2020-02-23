package Day07_Operators_casting_boolean_if;

import com.sun.security.jgss.GSSUtil;

public class TypeCasting {
    public static void main(String[] args){
        int n = 1234567;
        long l = n;// no need for L in the end
        System.out.println("n: " + n);
        System.out.println("l: " + l);
        double d = n; // adds a .0 decimal
        System.out.println("d: "+ d);
        //explicit Casting : parentheses before variable name & type

        int n2 = 120;
        byte b2 = (byte)n2;
        System.out.println("n2: " + n2);
        System.out.println("b2: "+ b2);

        int num3 = 1000;
                byte b3 = (byte)num3;
        System.out.println(" num3: " + num3);// -46
        System.out.println("num" + b3);


        double price = 120.44;
        int intPrice = (int)price;
        //Problem W/ casting if






    }
}
