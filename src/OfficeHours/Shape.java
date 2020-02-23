package OfficeHours;
import java.util.*;
import java.util.jar.JarOutputStream;

public abstract class Shape {
    Scanner scan = new Scanner(System.in);
    public abstract void Area();
        }
        class Circle extends Shape {
         double r;


         public Circle(double r){
             System.out.println("Enter the Radious of the Circle");

         }
            @Override
            public void Area() {
                double Area = r*r * 3.14;
                System.out.println("The area of the circle = " + Area);

            }
        }

            class Rectangle extends Shape{
                @Override
                public void Area() {
                    System.out.println("Enter the length and the width of the rectangle: ");
                    double l = scan.nextDouble();
                    double w = scan.nextDouble();
                    double Area = l * w;
                    System.out.println("The Area of the Rectangle is: " + Area);

                }
            }

