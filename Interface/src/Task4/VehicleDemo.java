package Task4;

import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle Demonstration\n");
        AbstractVehicle car = new Car("Car", "Petro", "Red",30.3,50);
        AbstractVehicle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black",3,20);
        AbstractVehicle bus = new Bus("Bus", "Diesel", "40 Passengers",20,60);
        AbstractVehicle electricCar = new ElectricCar("Electric Car", "Electric", 180,13,50);
        AbstractVehicle electricMotorcycle = new ElectricMotorcycle("Electric Motorcycle","Electric",70,6,40);
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
            vehicle.calculateFuelEfficiency();
        }
    }
}
