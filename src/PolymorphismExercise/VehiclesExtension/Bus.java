package PolymorphismExercise.VehiclesExtension;

public class Bus extends Vehicle{
    public final static double ADDITIONAL_FULL_BUS_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKm, tankCapacity);
    }
}
