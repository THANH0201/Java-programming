package Task2;

public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel);
        this.color = color;
    }

    public void getInfor() {
        System.out.println("Motorcycle Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s\n", type, fuel, color);
        System.out.println();
    }
}

