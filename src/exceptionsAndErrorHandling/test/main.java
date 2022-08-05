package exceptionsAndErrorHandling.test;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fibonacci(35));



    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n -2);
    }
}
