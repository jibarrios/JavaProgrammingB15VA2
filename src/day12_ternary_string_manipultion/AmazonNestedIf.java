package day12_ternary_string_manipultion;

public class AmazonNestedIf {
    public static void main(String[] args) {
        boolean isPrimeMember = true;
        double totalPrice = 23.45;

        if(isPrimeMember){
            System.out.println("Eligible for free Shipping");
        }else if(totalPrice>25.0){
            System.out.println("Eligible for free shipping");
        }else{
            System.out.println("Not Eligible for free shipping");
        }
    }
}
