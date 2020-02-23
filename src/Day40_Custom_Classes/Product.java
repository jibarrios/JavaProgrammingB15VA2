package Day40_Custom_Classes;

public class Product {


   /*
   Properties of the product. we declare them in class & outside any method
    */
        String title;
        double price;
        int rating;
        String seller;


    //custom method to acr as behavior for Product class
    public void displayInfo() {
        System.out.println("----- Product info ------");
        System.out.println("title = " + title);
        System.out.println("Price = $" + price);
        System.out.println("rating = " + rating);
        System.out.println("seller = " + seller);


    }

    public static void main(String[] args) {
        Product prod1 = new Product();
        // assign values to variables in the object
        prod1.title = "Wooden Spoon";
        prod1.price = 14.99;
        prod1.rating = 5;
        prod1.seller = "Mr. Memento";

        //how to read values from objects
        //System.out.println(onName.variableName);

        System.out.println("prod1 object title = " + prod1.title);
        System.out.println("prod1 object price = " + prod1.price);
        System.out.println("prod1 object rating = " + prod1.rating);
        System.out.println("prod1 object seller = " + prod1.seller);

    }
    }

