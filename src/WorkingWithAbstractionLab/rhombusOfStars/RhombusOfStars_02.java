package WorkingWithAbstractionLab.rhombusOfStars;

import java.util.Scanner;

public class RhombusOfStars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);

    }

    private static void printRhombus(int rhombusSize) {
        int rowCount = rhombusSize * 2 - 1;
        for (int row = 1; row <= rowCount; row++) {
            if (row <= rhombusSize) {
                printRow(row, rhombusSize - row);
            } else {
                printRow(rhombusSize * 2 - row, row - rhombusSize);
            }

        }
    }

    private static void printRow(int a, int b) {
        for (int i = b; i > 0; i--) {
            System.out.print(" ");
        }
        for (int j = 0; j < a; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
