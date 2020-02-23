package Day04_Math_Operators_Scanner;

public class EtsyItem {
    public static void main(String[] args){
        String title = "Soup Cook off personalized wooden spoon";
        String seller ="PersonalizedGallery";
        double stars = 5.0;
        int ratingCount = 8901;
        double price = 8.00;
        boolean bestseller = true;
        boolean freeshipping = true;

        System.out.println("Item title is " + title);
        System.out.println("Seller name is <"+  seller +">");
        // < > are regular characters
        System.out.println("Product has " + stars + " Stars");
        System.out.println("Product has " + ratingCount + " Rating!");
                System.out.println("Item pricing "+ price);
                System.out.println("Bestseller = " + bestseller);
                System.out.println("Free shipping = " + freeshipping +" Great!");
                System.out.println ("Product is $"+ price);

                // city1 city2, ticketPrice
String city1 = "New york";
String city2 = "Chicago";
double ticketPrice = 285.99;
//New york to chicago is $285.99
        System.out.println("From "+ city1 + " to " + city2 +" is $" + ticketPrice);




    }
}