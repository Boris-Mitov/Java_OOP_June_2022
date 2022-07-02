package WorkingWithAbstractionExercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = getRowsCols(scanner.nextLine());

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();
        long peterCollectedStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] peterCoordinates = getRowsCols(command);
            int[] evilCoordinates = getRowsCols(scanner.nextLine());

            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            evilDestroyStars(galaxy, evilRow, evilCol);

            int peterRow = peterCoordinates[0];
            int peterCol = peterCoordinates[1];

            peterCollectedStars = starsSumming(galaxy, peterCollectedStars, peterRow, peterCol);

            command = scanner.nextLine();
        }

        System.out.println(peterCollectedStars);
    }

    private static int[] getRowsCols(String scanner) {
        return Arrays.stream(scanner.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void fillGalaxy(int rows, int cols, int[][] galaxy) {
        int galaxyFillerValue = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = galaxyFillerValue;
                galaxyFillerValue++;
            }
        }
    }

    private static long starsSumming(int[][] galaxy, long sum, int peterRow, int peterCol) {
        while (peterRow >= 0 && peterCol < galaxy[1].length) {
            if (isInBounds(galaxy, peterRow, peterCol)) {
                sum += galaxy[peterRow][peterCol];
            }
            peterRow--;
            peterCol++;
        }
        return sum;
    }

    private static void evilDestroyStars(int[][] galaxy, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (isInBounds(galaxy, evilRow, evilCol)) {
                galaxy[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static boolean isInBounds(int[][] galaxy, int row, int col) {
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy[row].length;
    }
}
