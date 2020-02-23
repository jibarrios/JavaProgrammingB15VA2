package day12_ternary_string_manipultion;

public class CafeNested {
    public static void main(String[] args) {
        String order = "food";
        String drink = "";
        String food = "soup";
        double price = 0;
        if(order.equals("drink")){
            //INNER IF STATEMENT. WILL RUN only When order is drink
            if(drink.equals("soda")){
                price = 1.99;
            }else if(drink.equals("coffee")){
                price =4.99;
            }else if(drink.equals("water")){
                price = 1.55;
            }else{
                System.out.println("No Such item");
            }

       }else if(order.equals("food")){
            //INNER //NESTED IF STATEMENT
            if(food.equals("sandwitch")){
                price =7.45;
            }else if(food.equals("soup")){
                price = 3.99;
            }else if(food.equals("salad")){
                price = 9.99;
            }else{
                System.out.println("No such item");
            }
        }else{

            System.out.println("No such order available");
        }
            System.out.println("Total Price: " + price);

    }
}
