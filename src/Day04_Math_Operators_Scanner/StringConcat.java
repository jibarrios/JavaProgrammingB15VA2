package Day04_Math_Operators_Scanner;

public class StringConcat {
    public static void main(String[] args){
        String str = "My Name is ";
        String firstName = "adam";
        System.out.println(str + firstName);

        String str1 = "Hello";
        String str2 = "Friends!";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);
        String str3 = (str1+ " " +str2);
        System.out.println(str3);
    }
}
