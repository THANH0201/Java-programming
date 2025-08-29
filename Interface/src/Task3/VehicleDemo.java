package Task3;
import Task1.Vehicle;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration");
        AbstractVehicle car = new Car("Car", "Petro", "Red");
        AbstractVehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        AbstractVehicle bus = new Bus("Bus", "Diesel", "40 Passengers");
        AbstractVehicle electricCar = new ElectricCar("Electric Car", "Electric", 180);
        AbstractVehicle electricMotorcycle = new ElectricMotorcycle("Electric Motorcycle","Electric",70);
        ArrayList<AbstractVehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(bus);
        vehicles.add(electricCar);
        vehicles.add(electricMotorcycle);
        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            vehicle.getInfor();
            vehicle.charge();
        }
    }
}
