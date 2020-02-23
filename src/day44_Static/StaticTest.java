package day44_Static;
import java.lang.*; //Compiler adds this import to every class
public class StaticTest {
    public static void main(String[] args) {

        StaticVariables obj = new StaticVariables();
        System.out.println(obj.name);

        System.out.println(StaticVariables.userName);
        System.out.println(StaticVariables.age);
        System.out.println(StaticVariables.price);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        //System.out.println(Calculator.plus(4,6));
        // since no static need to access it through object
        Calculator calc = new Calculator();
        System.out.println(calc.plus(10,8));
        System.out.println(Calculator.divide(10,2));//minus is static method
        System.out.println(Calculator.minus(6,3));//divide is static method
        System.out.println("result = " );

        System.out.println(Math.abs(11));
        System.out.println(Math.abs(-8));

        System.out.println(Math.max(100,500));
        System.out.println(Math.cos(34.5));


        System.out.println(Math.round(85.50));

        //Math m = new Math(); you unable to create object b/c Static is in use

    }
}
