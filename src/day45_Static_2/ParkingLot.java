package day45_Static_2;

public class ParkingLot {
    public static void main(String[] args) {
        //Print numberOfVehicles static way
        System.out.println(Vehicle.numberOfVehicle);
       // System.out.println(Vehicle.model); model is non-Static

        Vehicle v1 = new Vehicle("TeslaCyberTruck");
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);

        Vehicle v2 = new Vehicle("Ford f150");
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);

        Vehicle.numberOfVehicle = 10;
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);

        Vehicle v3 = new Vehicle("Chevy Silverdo");//Vehicle Constructor Runs
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);

        v2.numberOfVehicle = 300;
        System.out.println(Vehicle.numberOfVehicle);
        System.out.println(v1.numberOfVehicle);
        System.out.println(v2.numberOfVehicle);
        System.out.println(v3.numberOfVehicle);

        v1.setModel("BMW 530i");

        System.out.println(v1.getModel());
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());




    }
}
