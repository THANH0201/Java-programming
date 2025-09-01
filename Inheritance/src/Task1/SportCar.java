package Task1;

public class SportCar extends ModifiedCar  {
    private double gasolevel;
    private double accelerate;
    private double decelerate;
    private String name;
    public SportCar(String name, int gasoline,double speed) {
        super(gasoline,speed);
        this.gasolevel = 30;
        this.accelerate= 25;
        this.decelerate= 20;
        this.name = name;

    }
    public double getGasolevel() {return gasolevel;}
    public double getAccelerate() {return accelerate;}
    public double getDecelerate() {return decelerate;}
    public String getName(String name) {return name;}


    @Override
    public String toString(){
        return String.format("Car %s has speed %.2f km/h, fuel capacity %d liters," +
                " accelerate %.2f km/h, decelerate %.2f km/h, fuel consumption %.2f\n",
                name,getSpeed(), getGasoline(), accelerate,decelerate,gasolevel);
    }
    public void display(){
        System.out.println(this);
    }
    public static void main(String [] args){
        SportCar car1 = new SportCar("Toyota1",100,200);
        SportCar car2 = new SportCar("BMW2",200,300);

        car1.display();
        car2.display();
        car1.introCar();
        System.out.println("Accelerate of " + car1.name + " is " + car1.getGasolevel() + " l/km");

    }
}

