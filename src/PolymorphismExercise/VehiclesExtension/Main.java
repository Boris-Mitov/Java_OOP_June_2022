package PolymorphismExercise.VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] vehicleData = scanner.nextLine().split(" ");

        Vehicle car = createVehicle(vehicleData);

        vehicleData = scanner.nextLine().split(" ");

        Vehicle truck = createVehicle(vehicleData);

        vehicleData = scanner.nextLine().split(" ");

        Vehicle bus = createVehicle(vehicleData);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandData = scanner.nextLine().split(" ");

            String command = commandData[0];
            String vehicleType = commandData[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(commandData[2]);
                    Vehicle vehicle = vehicles.get(vehicleType);
                    if (vehicle instanceof Bus) {
                        bus.setFuelConsumption(bus.getFuelConsumption() + Bus.ADDITIONAL_FULL_BUS_CONSUMPTION);
                        System.out.println(bus.drive(distance));
                        bus.setFuelConsumption(bus.getFuelConsumption() - Bus.ADDITIONAL_FULL_BUS_CONSUMPTION);
                        continue;
                    }
                    String driveMessage = vehicle.drive(distance);

                    System.out.println(driveMessage);
                break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(commandData[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                    break;
                case "DriveEmpty":
                    double driveEmptyDistance = Double.parseDouble(commandData[2]);
                    String driveEmptyMessage = bus.drive(driveEmptyDistance);
                    System.out.println(driveEmptyMessage);
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);

    }
    private static Vehicle createVehicle(String[] vehicleData) {
        String vehicleType = vehicleData[0];
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        double tankCapacity = Double.parseDouble(vehicleData[3]);
        Vehicle vehicle = null;

        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantity, fuelConsumption, tankCapacity);
                break;
        }
        return vehicle;
    }
}
