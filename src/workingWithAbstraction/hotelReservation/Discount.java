package workingWithAbstraction.hotelReservation;

public enum Discount {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);

    private double priceReductionFactor;

    Discount(double priceReduction) {
        this.priceReductionFactor = priceReduction;
    }

    public static Discount parse(String str) {
        switch (str) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown enum value " + str);
        }
    }

    public double getPriceReductionFactor() {
        return priceReductionFactor;
    }

}
