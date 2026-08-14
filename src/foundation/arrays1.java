package foundation;

import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};

         /* int sum = 0;
        int factSum = 0;


        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("Cemi: " + sum);

        for (int num : arr) {
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;

            }
            factSum += fact;

            System.out.println("Faktorial cemi: " + factSum);

        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
          if (arr[i] < min) {
          min = arr[i];
    }
            System.out.println("Minimal eded:" + min);
        } */


        /*for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        } */

        /* int min1 = arr[0];
        int min2 = arr[1];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            } else if (arr[i] < min2){
                min2 = arr[i];
            }
        }

        System.out.println("1-ci minimal: " + min1);
        System.out.println("2-ci minimal: " + min2); */

        int[] arr = {1, 2, 3, 4, 5};
        int[] ters = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ters[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(ters));
    }


}
