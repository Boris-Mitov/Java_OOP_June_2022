package PolymorphismExercise.Vehicles;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] vehicleData = scanner.nextLine().split(" ");

        Vehicle car = createVehicle(vehicleData);

        vehicleData = scanner.nextLine().split(" ");

        Vehicle truck = createVehicle(vehicleData);

        Map<String, Vehicle> vehicles = new HashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandData = scanner.nextLine().split(" ");

            String command = commandData[0];
            String vehicleType = commandData[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(commandData[2]);
                    String driveMessage = vehicles.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(commandData[2]);
                    vehicles.get(vehicleType).refuel(fuelAmount);
                    break;
            }
        }

        vehicles.values().forEach(System.out::println);

    }
    private static  Vehicle createVehicle(String[] vehicleData) {
        String vehicleType = vehicleData[0];
        double fuelQuantity = Double.parseDouble(vehicleData[1]);
        double fuelConsumption = Double.parseDouble(vehicleData[2]);
        Vehicle vehicle = null;

        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption);
                break;
        }
        return vehicle;
    }
}
