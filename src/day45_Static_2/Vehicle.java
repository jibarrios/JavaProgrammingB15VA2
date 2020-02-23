package day45_Static_2;

public class Vehicle {
    private String model; // Need an Object
    public static int numberOfVehicle = 0; //Since there is static no need for object

    public Vehicle(){
        System.out.println("Parking a unknown model Vehicle");
    numberOfVehicle++;
    }
    public Vehicle(String model){
        System.out.println("Parking " + model);
        this.model = model;
        numberOfVehicle++;
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;
        numberOfVehicle++;
    }

    public static int getNumberOfVehicle() {
        return numberOfVehicle;
    }

    public static void setNumberOfVehicle(int numberOfVehicle) {
        Vehicle.numberOfVehicle = numberOfVehicle;
    }
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
