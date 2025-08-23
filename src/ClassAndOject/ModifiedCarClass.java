package ClassAndOject;

public class ModifiedCarClass {
    private int gasoline;
    private double speed;
    public ModifiedCarClass(int gasoline, double speed) {
        this.gasoline = gasoline;
        this.speed = speed;
    }
    public void introCar() {
        System.out.printf("Car1: gasoline tank capacity is %d liters and speed is %.2f km/h",gasoline,speed);

    }
    public static void main(String[] args) {
        ModifiedCarClass car1 = new ModifiedCarClass(100, 200);
        car1.introCar();



    }
}
