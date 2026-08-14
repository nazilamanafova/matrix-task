package foundation;

public class Array2d {
    public static void main(String[] args){

        /* 1ci task
        int[][] arr = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows * cols; i++) {
            System.out.println(arr[i / cols][i % cols]);
        } */

        /* 2ci task
         int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] arr2 = {20, 10, 30, 40, 50, 60, 70, 80, 99};

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        int extra = sum2 - sum;
        System.out.println("Extra element: " + extra); */

        int[] arr = {6, 4, 7, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
