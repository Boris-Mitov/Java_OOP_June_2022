package PolymorphismExercise.Vehicles;

public abstract class Vehicle {
    private int fuelQuantity;
    private double fuelConsumptionPerKm;

    public Vehicle(int fuelQuantity, double fuelConsumptionPerKm) {
        setFuelQuantity(fuelQuantity);
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    public void setFuelQuantity(int fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public abstract String driving();

    public abstract double refueling(int litersToRefuel);
}
