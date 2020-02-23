package day11_String_comparsion_logical;

public class TollCalculator {
    public static void main(String[] args) {
        String vehicleType = "car";
        boolean isRushHour = true;
        double tollPrice=0;

        if(vehicleType.equalsIgnoreCase("car") && isRushHour== false){
            tollPrice= 3.0;
            System.out.println("Vehicle type: Car. Non-Rush hour! The toll price: " + tollPrice);
        }else if(vehicleType.equalsIgnoreCase("car") && isRushHour){
            tollPrice=7.50;
            System.out.println("Vehicle type: Car. Rush hour! The toll price: " + tollPrice);

        }else if(vehicleType.equalsIgnoreCase("truck") && isRushHour){
            tollPrice=4.75;
            System.out.println("Vehicle type: Truck.  Non-Rush hour! The toll price: " + tollPrice);

        }else if(vehicleType.equalsIgnoreCase("truck") && !isRushHour){
            tollPrice =11.50;
            System.out.println("Vehicle type: Truck. Rush hour! The toll price: " + tollPrice);

        }else {
            System.out.println("vehicle Type: Not recognized, Use different road");
        }

    }
}
