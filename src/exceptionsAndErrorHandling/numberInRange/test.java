package exceptionsAndErrorHandling.numberInRange;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int startIndex = range[0];
        int endIndex = range[1];

        System.out.printf("Range: [%d...%d]%n", startIndex, endIndex);
        boolean isValid = false;

        String line = scanner.nextLine();
        while (!isValid) {
            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(line));
            } catch (NumberFormatException ignored) {
            }

            if (number.isEmpty() || number.get() < startIndex || number.get() > endIndex) {
                    System.out.println("Invalid number: " + line);
                    line = scanner.nextLine();
            } else {
                isValid = true;
            }
        }

        System.out.println("Valid number: " + line);

    }
}
