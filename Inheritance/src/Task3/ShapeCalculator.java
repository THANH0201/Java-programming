package Task3;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(1));
        shapes.add(new Rectangle(2, 4));
        shapes.add(new Triangle(1.5, 5));
        System.out.println("Shape Calculator:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
