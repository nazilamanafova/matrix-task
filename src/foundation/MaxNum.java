package foundation;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int a = scanner.nextInt();

        System.out.println("Second number: ");
        int b = scanner.nextInt();

        System.out.println("Third number: ");
        int c = scanner.nextInt();

        int max;
        if (a >= b && a >= c){
            max = a;
        }else if( b >= a && b >= c){
            max = b;
        }else {
            max = c;
        }
        System.out.println("Largest number: " + max);
    }
}
