package Task3;


public class Bus extends AbstractVehicle {
    private String capacity;

    public Bus (String type, String fuel, String capacity) {
        super(type, fuel);
        this.capacity = capacity;
    }

    public void getInfor() {
        System.out.println("Bus Information");
        System.out.printf("Type: %s\nFuel: %s\nColor: %s", type, fuel, capacity);
        System.out.println();
    }
}



