import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");



        ShapeFactory shapeFactory2 = new ShapeFactory();
        ShapeDrawer drawer = new ShapeDrawer(shapeFactory2);

        drawer.drawShape(ShapeType.RECTANGLE);
        drawer.drawShape(ShapeType.SQUARE);
        drawer.drawShape(ShapeType.CIRCLE);





    }
}