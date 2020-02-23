package Day06_Opertors;

public class ShortHandOperators {
    public static void main(String[] args){
        int cars = 15;
        System.out.println("Cars in the parking lot:" + cars);
        cars = cars + 2;
        System.out.println("Cars in the parking lot: " + cars);
        cars += 3;
        System.out.println("Cars in the parking lot: " + cars);

        cars = cars -1;
        System.out.println("Cars in the parking lot: " + cars);
        cars -= 2;
        System.out.println("Cars in the parking lot: " + cars);

        cars *= cars + 3; // cars = cars * 3; (long way)
        System.out.println("Cars in the parking lot: " + cars);

        cars /= 2;
        System.out.println("Cars in the parking lot: " + cars);



        int carsBack = 20;
                cars += carsBack;// cars = cars + carsBack;
        System.out.println("cars in the parking lot: "+ cars);
        System.out.println("cars in the parking lot: "+ carsBack);


        String letters = "A";
        System.out.println("letters: " + letters);

        letters = letters + "B";
        System.out.println("Letter: " + letters);

        letters += "CD";
        System.out.println("Letters: "+ letters);
        // w/ string you cant do subtracting

        int apples = 10;
        apples %= 3; // apples = apples % 3;
        System.out.println("Apples Left: " + apples );





    }
}
