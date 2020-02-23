package groupSession;

public class TestClass {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Cat lulu";
        a1.eat();

        Animal a2 = new Animal();
        a2.name = "Dog- shrek";

        Animal.color = "Black";

        Animal a3 = new Animal();
        System.out.println(a3.color);
        System.out.println(a1.color);
        System.out.println(a2.color);

        a1.setSize(25);
        int size = a1.getSize();
        System.out.println(size);

    }
}
