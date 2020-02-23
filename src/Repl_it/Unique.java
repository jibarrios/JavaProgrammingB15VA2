package Repl_it;

public class Unique {
    public static void main(String[] args) {
        String str = "jjjaavvaa";
        String uniquee = "";


        for (int i = 0; i < str.length() ; i++) {
            String temp = str.charAt(i)+ ""; //<- when reading one letter and saving it inside temp
            System.out.println("temp = " + temp);

            if(!uniquee.contains(temp)){
                uniquee= uniquee+ temp;

            }
        }
        System.out.println("unique = " + uniquee);

        for (int outer = 0; outer <= 5 ; outer++) {
            for (int inner = 0; inner <= 9; inner++) {
                System.out.print(inner + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int outer = 0; outer <= 10 ; outer++) {
            for (int inner = 0; inner < outer ; inner++) {
                System.out.print(inner+" ");
            }
            System.out.println();
        }
        String s1 ="1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);






    }
}
