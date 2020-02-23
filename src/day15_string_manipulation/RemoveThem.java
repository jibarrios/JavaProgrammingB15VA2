package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // javaisfun
        //" " --> ""
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("Sentence = " + sentence);
        System.out.println("withNoSpace = " + withNoSpace);
        //remove is
        System.out.println(sentence.replace(" is ", " "));
        System.out.println(sentence.replace(" is ", ""));
        
        
        String etsyResult = "iphone case (212,713 results)";//212713

        etsyResult= etsyResult.replace("iphone case (","");
        etsyResult = etsyResult.replace(",","");
        etsyResult = etsyResult.replace("results)","");
        System.out.println("etsyResult = " + etsyResult);
        
        String mixed ="!@J#$A%^VA*(";//JAVA

        mixed = mixed.replace("!@","");
        mixed = mixed.replace("#$","");
        mixed = mixed.replace("%^","");
        mixed =mixed.replace("*(","");
        System.out.println("mixed = " + mixed);

    }
}
