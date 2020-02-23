package day54_Polymorism;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }
@Override
    public void draw() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
