package day54_Polymorism;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Shape shape = new Shape();
        Square square = new Square();
        Diamond diamond = new Diamond();

        shape.draw();
        square.draw();
        diamond.draw();

        //POLYMORPHISM
        System.out.println("---- Polymorphism ---");
        Shape shape1 = new Square();
        shape1.draw();


        shape1 = new Triangle();
        shape1.draw();

        shape1 = new Diamond();
        shape1.draw();


        new Triangle().draw();
        new Square().draw();
        new Diamond().draw();


    }}
