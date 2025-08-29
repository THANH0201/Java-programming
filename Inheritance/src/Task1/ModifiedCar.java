package Task1;
public class ModifiedCar {
    private int gasoline;
    private double speed;
    public ModifiedCar(int gasoline, double speed) {
        this.gasoline = gasoline;
        this.speed = speed;
    }
    public int getGasoline() { return gasoline; }
    public double getSpeed() { return speed; }

    public void introCar() {
        System.out.printf("Car1: gasoline tank capacity is %d liters and speed is %.2f km/h\n",gasoline,speed);
    }
    public static void main(String[] args) {
        ModifiedCar car1 = new ModifiedCar(100, 200);
        car1.introCar();



    }
}