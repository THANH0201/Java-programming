package Task4;


public class Bus extends AbstractVehicle {
    private String capacity;
    private double fuelLevel;
    private double distance;

    public Bus (String type, String fuel, String capacity, double fuelLevel, double distance) {
        super(type, fuel);
        this.capacity = capacity;
        this.fuelLevel = fuelLevel;
        this.distance = distance;
    }

    public void getInfor() {
        System.out.println("Bus Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s", type, fuel, capacity);

    }
    @Override
    public double calculateFuelEfficiency() {
        System.out.printf("The fuel efficiency: %.2f l/km\n\n", distance/fuelLevel);
        return distance/fuelLevel;
    }

}



