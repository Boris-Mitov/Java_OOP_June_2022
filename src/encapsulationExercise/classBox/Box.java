package encapsulationExercise.classBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        checkForNegativeArgument(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNegativeArgument(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkForNegativeArgument(height, "Height");
        this.height = height;
    }

    private void checkForNegativeArgument(double argument, String argumentName) {
        if (argument <= 0) {
            throw new IllegalArgumentException(String.format("%s cannot be zero or negative.", argumentName));
        }
    }

    public double calculateSurfaceArea(){
        return calculateLateralSurfaceArea() + 2 * length * width;
    }

    public double calculateLateralSurfaceArea(){
        return 2 * length * height + 2 * width * height;
    }

    public double calculateVolume(){
        return width * height * length;
    }


}
