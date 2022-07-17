package PolymorphismExercise.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String[] carData = scanner.nextLine().split(" ");

        double carFuelQuantity = Double.parseDouble(carData[1]);
        double carFuelConsumption = Double.parseDouble(carData[2]);

        Vehicle car = new Car(carFuelQuantity, carFuelConsumption);
        vehicles.add(car);
        String[] truckData = scanner.nextLine().split(" ");

        double truckFuelQuantity = Double.parseDouble(truckData[1]);
        double truckFuelConsumption = Double.parseDouble(truckData[2]);

        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumption);
        vehicles.add(truck);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandData = scanner.nextLine().split(" ");

            String command = commandData[0];
            String vehicleType = commandData[1];
            double value = Double.parseDouble(commandData[2]);

            switch (command) {
                case "Drive":
                    if (vehicleType.equals("Car")) {
                        System.out.println(car.drive(value));;
                    } else if (vehicleType.equals("Truck")) {
                        System.out.println(truck.drive(value));;
                    }
                break;
                case "Refuel":
                    if (vehicleType.equals("Car")) {
                        car.refuel(value);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refuel(value);
                    }
                    break;
            }
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

    }
}
