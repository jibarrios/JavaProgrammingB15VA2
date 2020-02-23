package day55_polymorhism;

import day54_Polymorism.*;
import java.util.*;
public class ShapeManager {
    public static Shape buildShape(String type){
        System.out.println("Building shape of type - "+ type + "...");
        Shape retShape = null;
        switch (type.toLowerCase()){
            case "shape":
                retShape = new Shape();
                break;
            case "triangle":
                retShape = new Triangle();
                break;
            case "diamond":
                retShape = new Diamond();
                break;
            case "square":
                retShape = new Square();
                break;
        }

        return retShape;
    }

    public static void drawSquare(Square squareObj){
        System.out.println("Drawing a square...");
        squareObj.draw();
    }

    public static void drawShape(Shape shapeObj){
        System.out.println("Drawing a shape - " + shapeObj.type+"...");
        shapeObj.draw();
    }

    public static void drawShape(List<Shape> shapeList){
        for(Shape each : shapeList) {
            System.out.println("Drawing a shape - " + each.type + "...");
            each.draw();
        }
    }

    public static void drawShapeFromObject(Object object){
        System.out.println("Drawing shape from object...");
        System.out.println(object.getClass().getSimpleName());
    }
}
