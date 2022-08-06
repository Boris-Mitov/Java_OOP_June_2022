package exceptionsAndErrorHandling.squareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsString = new Scanner(System.in).nextLine();

        double sqrt = -1;

        try {
            sqrt = sqrtCalc(Integer.parseInt(numberAsString));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        }

        if(sqrt != -1) {
            System.out.printf("%.2f%n",sqrt);
        }

        System.out.println("Goodbye");

    }

    public static double sqrtCalc (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid");
        }
        return Math.sqrt(n);
    }
}
