package solid.products;

public class Chips extends Food implements Product{

    public static final double CALORIES_PER_100_GRAMS = 529.0;

    public Chips(double grams) {
        super(grams);
    }

    @Override
    public double getAmountOfCalories() {
        double overallCalories = (CALORIES_PER_100_GRAMS / 100 ) * this.getGrams();
        return overallCalories;
    }

}

