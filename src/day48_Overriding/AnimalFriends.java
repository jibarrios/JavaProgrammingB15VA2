package day48_Overriding;

import OfficeHours.HotdogStand;

public class AnimalFriends {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        animal.move();

        Cat cat = new Cat();
        cat.speak();//This is an example of Overriding
        // Same method in the parent class but we Customized the method for the Subclass
        cat.move();


        Horse pony = new Horse();
        pony.speak();
        pony.move();


        Wolf greyWolf = new Wolf();
        greyWolf.speak();
        greyWolf.move();

        animal.eat("apple");
        cat.eat("Cat food");
        pony.eat("Hay with carrots");
        greyWolf.eat("Sheep meat");
    }
}
