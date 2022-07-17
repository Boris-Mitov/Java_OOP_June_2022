package PolymorphismExercise.Vehicles;

public class Car extends Vehicle{
    public Car(int fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
    }

    @Override
    public String driving() {
        return null;
    }

    @Override
    public double refueling(int litersToRefuel) {
        return litersToRefuel;
    }

}
