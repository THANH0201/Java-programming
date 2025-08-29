package Task4;

public class Car extends AbstractVehicle {
    private String color;
    private double fuelLevel;
    private double distance;

    public Car(String type, String fuel, String color, double fuelLevel, double distance) {
        super(type, fuel);
        this.color = color;
        this.fuelLevel = fuelLevel;
        this.distance = distance;
    }
    public void getInfor() {
        System.out.println("Car Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s\n", type, fuel, color);
    }

    @Override
    public double calculateFuelEfficiency() {
        System.out.printf("The fuel efficiency: %.2f l/km\n\n", distance/fuelLevel);
        return distance/fuelLevel;
    }

}

