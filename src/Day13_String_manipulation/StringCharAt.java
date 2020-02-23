package Day13_String_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String company = "Cybertek";
        System.out.println(company.length());// 8. it starts from 1 
        System.out.println(company.charAt(0));//c
        System.out.println(company.charAt(1));//y
        System.out.println(company.charAt(2));
        System.out.println(company.charAt(3));
        System.out.println(company.charAt(4));
        System.out.println(company.charAt(5));
        System.out.println(company.charAt(6));
        System.out.println(company.charAt(7));
        // System.out.println(company.chartAt(8)); StringIndexOutOfBoundsException
        
        //Store first letter into variable
        char first= company.charAt(0);
        System.out.println("first = " + first);
        //Check if First Character is 'C'
        //print "c is first letter
        if(company.charAt(0) == 'C'){
        System.out.println("C is first letter");
    }else {
            System.out.println("C is not first letter");
        }
    String word = "civic"; // palindrome word
        // read first & last Character & store into firstl, lastl variable
        char firstl = word.charAt(0);
        char lastl = word.charAt(4); // word.length() -1)
        // put a condition if they match.
        //if yes --> "first & last do not match"
        if(firstl == lastl) {
            System.out.println("first & last match");
        }else{
            System.out.println("does not match");
        }
        // c i v i c
        System.out.println(word.charAt(0) + " " + word.charAt(1) + " " + word.charAt(2)+ " " + word.charAt(3) + " " +word.charAt(4));



    }
}
