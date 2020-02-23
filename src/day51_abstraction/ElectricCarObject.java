package day51_abstraction;

public class ElectricCarObject {
    public static void main(String[] args) {
       // ElectricCar car = new ElectricCar(); ERROR cannot be instantiated
        Tesla modelS = new Tesla();
        modelS.charge();
        modelS.start();
         modelS.drive();
         modelS.stop();
         modelS.price = 43000;
         modelS.color = "Grey";
         modelS.model ="Model S";

        Ford fusion = new Ford();
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        TeslaSemi semi = new TeslaSemi();
        semi.charge();
        semi.start();
        semi.load("Potatoes");
        semi.drive();
        semi.stop();


        TeslaTrunk truck = new TeslaTrunk();
        truck.charge();
        truck.start();
        truck.load("tomatoes");
        truck.drive();
        truck.stop();
        truck.model = "CyberTruck";
        truck.price = 150000;
        truck.color = "Sliver";

        System.out.println(modelS.toString());
        System.out.println(truck.toString());


    }
}
