package Task1;

public class Motorcycle implements Vehicle {
    private String type;
    private String color;
    private String fuel;

    public Motorcycle(String type, String fuel, String color) {
        this.type = type;
        this.color = color;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping");
    }

    @Override
    public void getInfor() {
        System.out.println("Motorcycle Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s\n", type, fuel, color);
        System.out.println();
    }
}

