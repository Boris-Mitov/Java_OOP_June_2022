package exceptionsAndErrorHandling.examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fibonacci(12));



    }

    public static long fibonacci(long n) {
        System.out.println();
        if (n <= 2) {
            return 1;
        }

        if (n == 7) {
            throw new IllegalStateException("My code sucks!");
        }

        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
