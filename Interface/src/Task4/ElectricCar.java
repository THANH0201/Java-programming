package Task4;

public class ElectricCar extends AbstractVehicle {
    private int speed;
    private double fuelLevel;
    private double distance;
    public ElectricCar (String type, String fuel, int speed, double fuelLevel, double distance) {
        super(type, fuel);
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        this.distance = distance;
    }
    @Override
    public void getInfor() {
        System.out.println("ElectricCar Information");
        System.out.printf("Type: %s\nFuel: %s\nSpeed: %d km/h", type, fuel,speed);
    }
    @Override
    public void charge() {
        System.out.println("ElectricCar is charging");
    }
    @Override
    public double calculateFuelEfficiency() {
        System.out.printf("The fuel efficiency: %.2f kWh/km\n\n", distance / fuelLevel);
        return distance / fuelLevel;
    }
}
