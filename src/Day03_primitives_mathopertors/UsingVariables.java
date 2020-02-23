package Day03_primitives_mathopertors;

public class UsingVariables {
    public static void main(String[] args){
        int num1, num2, num3;
        num1 = 100;
        num2 = num1;
        num3 = num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        num1=500;
        System.out.println(num1); //500
        System.out.println(num3);/* The only way to change a value is
        if you change it. If not it stay the same */
        System.out.println(num2);

    }
}
