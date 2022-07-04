package EncapsulationExercise.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                String exceptionMessage = String.format("Cannot place %s on top of your pizza.", this.toppingType);
                throw new IllegalArgumentException(exceptionMessage);
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            String exceptionMessage = String.format("%s weight should be in the range [1..50].", this.toppingType);
            throw new IllegalArgumentException(exceptionMessage);
        }
        this.weight = weight;
    }
}
