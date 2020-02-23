package day48_Overriding;

public class Horse extends Animal {

    public void speak(){
        System.out.println("Horse goes IAHAHAHA");
    }
    @Override
    public void move(){
        System.out.println("Horse Galloping");
    }
    @Override
    public void eat(String food) {
        System.out.println("Horse is eating " + food);
    }

}
