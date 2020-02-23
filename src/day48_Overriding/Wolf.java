package day48_Overriding;

public class Wolf extends Animal{

    @Override
    public void speak(){
        System.out.println("Wolf goes woo wooo");
    }
    @Override //<-- this verifies if the method is actually overriding from
    // the Super (parent) Class
    public void move(){
        System.out.println("Wolf Attacked");
    }
    @Override
    public void eat(String food) {
        System.out.println("Wolf is eating "+ food);

    }
}
