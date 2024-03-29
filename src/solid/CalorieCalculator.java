package solid;

import solid.products.Chocolate;
import solid.products.Coke;
import solid.products.Lemonade;
import solid.products.Product;

import java.util.List;
import java.util.stream.Collectors;

public class CalorieCalculator {

    private final Printer printer;
    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";

    public CalorieCalculator() {
        this.printer = new Printer();
    }

    public double sum(List<Product> products) {
        double sum = 0;

        final Double reduce = products.stream()
                .mapToDouble(Product::getAmountOfCalories)
                .sum();

        print(SUM_FORMAT, sum);

        return reduce;
    }

    public double average(List<Product> products) {
        final double average = sum(products) / products.size();
        print(AVERAGE_FORMAT, average);
        return average;
    }

    public void print(String format, double amount) {
        this.printer.print(format, amount);
    }
}
