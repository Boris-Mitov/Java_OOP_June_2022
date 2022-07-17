package PolymorphismExercise.Vehicles;

public class Truck extends Vehicle{


    public Truck(int fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + 1.6);
    }

    @Override
    public String driving() {
        //TODO
        return null;
    }

    @Override
    public double refueling(int litersToRefuel) {
        return litersToRefuel * 0.95;
    }
}
