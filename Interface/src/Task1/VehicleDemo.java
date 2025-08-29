package Task1;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        Vehicle car = new Car("Car", "Petro", "Red");
        Vehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        Vehicle bus = new Bus("Bus", "Diesel", "40 Passengers");
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(bus);
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            vehicle.getInfor();
        }
    }
}


