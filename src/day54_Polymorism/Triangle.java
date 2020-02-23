package day54_Polymorism;

public class Triangle extends Shape {
    public Triangle(){
        type = "Trangle";
    }
    @Override
    public void draw(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

