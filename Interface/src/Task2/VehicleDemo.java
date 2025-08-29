package Task2;

import Task1.Vehicle;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        AbstractVehicle car = new Car("Car", "Petro", "Red");
        AbstractVehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        AbstractVehicle bus = new Bus("Bus", "Diesel", "40 Passengers");
        ArrayList<AbstractVehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(bus);
        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            vehicle.getInfor();
        }
    }
}


