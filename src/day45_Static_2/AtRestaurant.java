package day45_Static_2;

public class AtRestaurant {
    public static void main(String[] args) {
        Dinner Mom = new Dinner();
        Dinner Dad = new Dinner();
        Dinner kid = new Dinner();


        System.out.println("Total slice: " + Dinner.pizzaSlices);
        kid.takeASlice();
        Mom.takeASlice();
        Dad.takeASlice(2);

        System.out.println("Total slice: " + Dinner.pizzaSlices);
        System.out.println("Kid: " + kid.pizzaSlices);
        System.out.println("Mom: " + Mom.pizzaSlices);
        System.out.println("Dad: " + Dad.pizzaSlices);

        Mom.takeASlice();
        kid.takeASlice(2);
        Dad.takeASlice();

        System.out.println("Total slice: " + Dinner.pizzaSlices);// If static was
        //Removed there would be issue. Since Static gave Direct Access (now no more)
        System.out.println("Kid: " + kid.pizzaSlices);
        System.out.println("Mom: " + Mom.pizzaSlices);
        System.out.println("Dad: " + Dad.pizzaSlices);


        Dad.pizzaSlices = 8;
        System.out.println("Total slice: " + Dinner.pizzaSlices);
        System.out.println("Kid: " + kid.pizzaSlices);
        System.out.println("Mom: " + Mom.pizzaSlices);
        System.out.println("Dad: " + Dad.pizzaSlices);




    }
}
