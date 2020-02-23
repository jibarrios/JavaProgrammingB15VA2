package day51_abstraction;

public class TeslaSemi extends ElectricTruck{

    @Override
    public void load(String items) {
        System.out.println("teslaSemi - load " + items + " lowering the truck");
    }

    @Override
    public void start() {
        System.out.println("Tesla - Start truck by pressing a button.. ");
    }

    @Override
    public void charge() {
        System.out.println("TeslaSemi charging - plug into outlet");

    }

    @Override
    public void drive() {
        System.out.println("TeslaSemi is driving...");
    }
}
