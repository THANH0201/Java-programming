package Task3;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + ", length " + super.toString();
    }


}