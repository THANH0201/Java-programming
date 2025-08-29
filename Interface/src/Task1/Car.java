package Task1;

public class Car implements Vehicle {
    private String type;
    private String color;
    private String fuel;

    public Car(String type, String fuel, String color) {
        this.type = type;
        this.color = color;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void getInfor() {
        System.out.println("Car Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s\n", type, fuel, color);
        System.out.println();
    }
}

