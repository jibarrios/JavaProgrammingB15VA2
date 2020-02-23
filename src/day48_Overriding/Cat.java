package day48_Overriding;

public class Cat extends Animal{
    public void speak(){
        System.out.println("Cat is saying Meow Meow...");//This is an example of Overriding
    }// Same method in the parent class but we Customized the method for the Subclass
    public void move(){
        System.out.println("Cat is Moving...");
    }

    @Override
    public void eat(String str) { // Still considered overriding b/c its a string variable
        //Does not have to be the same name
        System.out.println("Cat is eating "+ str);
    }
}
