package foundation;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < size; i++) {

            int n = arr[i];

            if (n > max1) {
                max2 = max1;
                index2 = index1;

                max1 = n;
                index1 = i;
            }

            else if (n > max2) {
                max2 = n;
                index2 = i;
            }
        }

        int sum = index1 + index2;

        System.out.println("Max1 index = " + index1);
        System.out.println("Max2 index = " + index2);
        System.out.println("Sum = " + sum);

    }
}