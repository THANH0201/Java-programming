package Task1;

public class Bus implements Vehicle {
    private String type;
    private String capacity;
    private String fuel;

    public Bus(String type, String fuel, String capacity) {
        this.type = type;
        this.capacity = capacity;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping");
    }

    @Override
    public void getInfor() {
        System.out.println("Bus is Information");
        System.out.printf("Type: %s\nFuel: %s\nCapacity: %s\n", type, fuel, capacity);
        System.out.println();
    }
}



