package Task3;

public class ElectricCar extends AbstractVehicle {
    private int speed;
    public ElectricCar (String type, String fuel, int speed) {
        super(type, fuel);
        this.speed = speed;
    }
    @Override
    public void getInfor() {
        System.out.println("ElectricCar Information");
        System.out.printf("Type: %s\nFuel: %s\nSpeed: %d km/h", type, fuel,speed);
        System.out.println();
    }
    @Override
    public void charge() {
        System.out.println("ElectricCar is charging\n");
    }
}
