package Task3;
import Task1.Vehicle;

public abstract class AbstractVehicle implements Vehicle,ElectricVehicle {
    protected String type;
    protected String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;

    }
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
    public void getInfor() {
        System.out.println("Vehicle Information");
        System.out.println(" Type : " + type);
        System.out.println(" Fuel : " + fuel);
    }
    @Override
    public void charge() {
        System.out.println("Not possible to charge\n");
    }

}



