package Task4;

public class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(" has area is %.2f and the color of this shape is %s", calculateArea(), color);
    }


}
