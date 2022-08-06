package exceptionsAndErrorHandling.numberInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] range = scanner.nextLine().split(" ");
        int startIndex = Integer.parseInt(range[0]);
        int endIndex = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]%n", startIndex, endIndex);
        boolean isValid = false;

        String line = scanner.nextLine();
        while (!isValid) {
            try {
                int number = Integer.parseInt(line);
                if (number >= startIndex && number <= endIndex) {
                    System.out.println("Valid number: " + number);
                    isValid = true;
                } else {
                    System.out.println("Invalid number: " + line);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + line);
            }
            if(!isValid) {
                line = scanner.nextLine();
            }

        }

    }
}
