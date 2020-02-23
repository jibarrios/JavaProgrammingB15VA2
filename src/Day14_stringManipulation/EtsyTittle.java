package Day14_stringManipulation;

public class EtsyTittle {
    public static void main(String[] args) {
String title = "wooden spoon | Etsy";
    if(title.startsWith("wooden spoon") && title.contains(" | ") && title.endsWith("Etsy")){
        System.out.println("Test passed. Etsy title is correct");
    }else{
        System.out.println("Test fail. Etsy title has bug");
    }


    }
}
