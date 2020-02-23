package Day20_forloop_3;

public class PrintByPortion {
    public static void main(String[] args) {
        String str ="pizza, soup, chicken , kebab, shrimp, ice cream";
        for (int i = 0; i < str.length()-2; i++){ // - # one number less for
            // amount you want to print out
            // System.out.println(str.charAt(i + " "+ str.charAt(i+1) +" "+str.charAt(i+2)));
            System.out.println(str.substring(i,i+3));
        }
    }
}
