package day43_Constructers;

public class CatConstructor {
    public static void main(String[] args) {
        Cat luna = new Cat();
        Cat mimi = new Cat();

        System.out.println("luna " + luna.getName());
        System.out.println("mimi " + mimi.getName());


        Cat bella = new Cat("bella");
        System.out.println("bella: " + bella.getName());

    }
}
