package workingWithAbstractionExercise.cardSuit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        Arrays.stream(CardsSuits.values())
                .forEach(e -> System.out.printf("Ordinal value: %d; Name value: %s%n", e.ordinal(), e.name()));
    }
}
