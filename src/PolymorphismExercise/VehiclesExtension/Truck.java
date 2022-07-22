package PolymorphismExercise.VehiclesExtension;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double TANK_LEAKAGE_MULTIPLIER = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_AC_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        liters *= TANK_LEAKAGE_MULTIPLIER;
        super.refuel(liters);
    }
}
