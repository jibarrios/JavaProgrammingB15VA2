package Day40_Custom_Classes;
/*
purpose of this class is to have main method to execute, and from product class
 */
public class EtsyShop {
    public static void main(String[] args) {
         // declare 2 product objects
        Product prodObj1 = new Product();
        Product prodObj2 = new Product();

        //assign value to prodOnj1
        prodObj1.title = "Wooden Banana";
        prodObj1.price = 4.50;
        prodObj1.rating = 5;
        prodObj1.seller = "BananaSeller";

        System.out.println(prodObj1.title);
        System.out.println(prodObj2.title);

        prodObj2.title = "Wool Gloves";
        prodObj2.price = 25.44;
        prodObj2.rating = 4;
        prodObj2.seller = "WoolSeller";
        //prod1.freeShipping = false; error: this variable not product class

        //print values from prodObj1
        System.out.println("Prod1 title: " + prodObj1.title);
        System.out.println("Prod1 Price: " + prodObj1.price);
        System.out.println("Prod1 rating: " + prodObj1.rating);
        System.out.println("Prod1 seller: " + prodObj1.seller);

        System.out.println("---------------------------------");

        System.out.println("Prod1 title: " + prodObj2.title);
        System.out.println("Prod1 Price: " + prodObj2.price);
        System.out.println("Prod1 rating: " + prodObj2.rating);
        System.out.println("Prod1 seller: " + prodObj2.seller);

        // Call the method of Product Class
        //objName.MethodName()
        prodObj1.displayInfo();
        prodObj2.displayInfo();


    }
}

