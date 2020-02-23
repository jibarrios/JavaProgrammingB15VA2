package day22_arrays_intro;

public class FindNonDiplicates {
    public static void main(String[] args) {
        String str = "java";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char outerLetter = str.charAt(i);
            System.out.println("checking = " + outerLetter);
            int count = 0;
            // inner loop to loop through each letter again

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                System.out.println("Comparing inner loop letter; " + innerLetter);
            /*
            check if letter matches any letter in inner loop also make sure
            i & j are not same!
            if they are the same, it mean we are looking same letter in same
            position
             */

                if (innerLetter == outerLetter && i != j) {
                    System.out.println(outerLetter + " has a duplicate");
                    count++;
                }

            }
            if (count == 0) {
                System.out.println(outerLetter + " is unique. No Duplicates");
                unique += outerLetter;
            } else {
                System.out.println(outerLetter + " has Duplicates");
            }
        }
        System.out.println("unique = " + unique);




    }
}
