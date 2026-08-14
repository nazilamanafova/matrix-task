package foundation;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int minPrime = Integer.MAX_VALUE;
        int maxPrime = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            int n = arr[i];
            boolean prime = true;

            if (n <= 1) {
                prime = false;
            } else {
                for (int j = 2; j <= n / 2; j++) {
                    if (n % j == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            if (prime) {
                minPrime = n;
            }
            if (n > maxPrime) {
                maxPrime = n;
            }
        }
        int sum = minPrime + maxPrime;
        System.out.println("Annotations.Min prime = " + minPrime);
        System.out.println("Annotations.Max prime = " + maxPrime);
        System.out.println("Sum = " + sum);


    }
}
