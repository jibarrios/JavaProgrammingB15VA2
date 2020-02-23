package Review_Basics101;

public class Palindrome {
    public static void main(String[] args) {


        String word = "civic";
        System.out.println(word.length());

        if (word.charAt(0) == 'c' && word.charAt(word.length()-1) == 'c'){
            System.out.println(word);
        }else{
            System.out.println("Not palindrome");
        }

        String w2 = "String";



        String dumbAss = "www.dumbAss.org/html.cp";

        int first = dumbAss.indexOf(".");
        System.out.println(first);
        int second = dumbAss.indexOf(".",first+1);
        System.out.println(second);
        int second2 = dumbAss.indexOf(".",dumbAss.indexOf(".") + 1);
        //Check the parentheses are ing the right place
        System.out.println("Other way to find the second " + second2);




    }
}
