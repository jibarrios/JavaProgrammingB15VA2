package day11_String_comparsion_logical;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class StringEquals {
    public static void main(String[] args) {
        String str = "java";
        String str2 =new String("java"); // lets you assign same result to
        // different variable
        // campare using //
        System.out.println(str =="java");
        System.out.println(str2 == "java");
        // compare using .equals() method

        System.out.println(str.equals("java"));
        System.out.println(str2.equals("java"));
        System.out.println(str.equals("Java")); // result false b/c of captial J

        // IgnoreCase method
        System.out.println(str.equalsIgnoreCase("java"));
        System.out.println(str.equalsIgnoreCase("JAVA"));

        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str2));







    }
}
