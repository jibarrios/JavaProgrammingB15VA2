package day26_array05_spilt;

public class CarsArray {
    public static void main(String[] args) {
        String[] cars = {"Ford", "Chevy","Kia", "Hyundai",
                "Bmw", "Audi", "Mercedes","Fiat", "Ferrari",
                "Alfa Romeo","Bugatti", "Renault", "Toyota", "Honda", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            if (cars[i].equals("Ford") || cars[i].equals("Chevy") ) {
                System.out.println(cars[i] + " is American car");
            }else if(cars[i].equals("Toyota") || cars[i].equals("Honda")|| cars[i].equals("Mazda")) {
                System.out.println(cars[i] + " is Japaneses car");
            }else if(cars[i].equals("Kia") || cars[i].equals("Hyundai")) {
                System.out.println(cars[i] +" is Koren car");
            }else if(cars[i].equals("Bmw") || cars[i].equals("Audi") || cars[i].equals("Mercedes")) {
                System.out.println(cars[i] +" is German car");
            }else if (cars[i].equals("Fiat") ||cars[i].equals("Ferrari")||cars[i].equals("Alfa Romeo")) {
                System.out.println(cars[i] + " is italian car");
            }else if(cars[i].equals("bugatti") || cars[i].equals("Renault")) {
                System.out.println(cars[i] + " is French car");

            }

        }



    }
}
