package InheritanceExercise.NeedForSpeed;

public class Main {
    public static void main(String[] args) {
        RaceMotorcycle raceMotorcycle = new RaceMotorcycle(35,200);
        CrossMotorcycle crossMotorcycle = new CrossMotorcycle(25, 125);
        FamilyCar familyCar = new FamilyCar(70, 90);
        SportCar sportCar = new SportCar(50, 350);

        System.out.println(sportCar.getFuel());
        System.out.println(sportCar.getFuelConsumption());
        System.out.println(sportCar.getHorsePower());

        try {
            sportCar.drive(400);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sportCar);

    }
}
