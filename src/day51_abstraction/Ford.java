package day51_abstraction;

public class Ford extends ElectricCar {
    @Override
    public void start() {
        System.out.println("ford - push Start button to start...");

    }
    @Override
    public void charge() {
        System.out.println("Ford - Charging ");

    }

    @Override
    public void drive() {
        System.out.println("Ford is driving...");
    }
}
