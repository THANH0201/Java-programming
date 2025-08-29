package Task4;

public class Triangle extends Shape {
    private double height;
    private double base;
    public Triangle(double height, double base, String color) {
        super(color);
        this.height = height;
        this.base = base;
    }
    @Override
    public double calculateArea() {
        return 1/2.0 *(height * base);
    }

    @Override
    public String toString() {
        return "Triangle with height " + height + ", base " + base + super.toString();
    }


}