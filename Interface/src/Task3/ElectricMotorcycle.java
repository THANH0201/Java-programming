package Task3;

public class ElectricMotorcycle extends AbstractVehicle {
    private int speed;
    public ElectricMotorcycle (String type, String fuel, int speed) {
        super(type, fuel);
        this.speed = speed;
    }
    @Override
    public void getInfor() {
        System.out.println("ElectricMotorcycle Information");
        System.out.printf("Type: %s\nFuel: %s\nSpeed: %d km/h", type, fuel,speed);
        System.out.println();
    }
    @Override
    public void charge() {
        System.out.println("ElectricMotorcycle is charging\n");
    }
}


