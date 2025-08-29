package Task2;
import Task1.ModifiedCar;
public class Bus extends ModifiedCar {
    private int enterCustomer;
    private int exitCustomer;
    private String name;
    private int re;
    public Bus(String name, int gasoline,double speed) {
        super(gasoline, speed);
            this.enterCustomer = enterCustomer;
            this.exitCustomer = exitCustomer;
            this.name = name;
            this.re = re;
        }
    public int getEnterCustomer() {return enterCustomer;}
    public int getExitCustomer() {return exitCustomer;}
    public void setEnterCustomer(int enterCustomer) {
        this.enterCustomer = enterCustomer;
    }

    public void setExitCustomer(int exitCustomer) {
        this.exitCustomer = exitCustomer;
    }
    @Override
    public String toString() {
        return String.format("Bus %s has speed %.2f km/h, fuel capacity %d liters",name,getSpeed(),getGasoline());
    }
    public void displayBus(){
        System.out.println(this);
    }
    public void setRe(int entry, int exit){
        this.re = entry-exit;
    }
    public int getRemainder() {return re;}

    public static void main(String[] args) {
        Bus bus = new Bus("544",10,10);
        bus.introCar();
        bus.displayBus();
        int entry = 20;
        bus.setEnterCustomer(entry);
        int exit = 18;
        bus.setExitCustomer(exit);
        bus.setRe(entry,exit);
        bus.getRemainder();
        System.out.printf("The entry customer are %d, exit customer are %d, %d customer are on bus",bus.getEnterCustomer(),bus.getExitCustomer(),bus.getRemainder());
    }

}
