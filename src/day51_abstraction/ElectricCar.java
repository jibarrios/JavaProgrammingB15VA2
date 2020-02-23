package day51_abstraction;

public abstract class ElectricCar {
    String model;
    double price;
    String color;

    @Override
    public String toString() {
        return "Electric Vehicle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void start(); //What TODO, INSTEAD OF HOW TODO HIDE IMPLEMENTATION
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car is stopping by pushing break pad");
    }
}
