package foundation;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        /* 1ci task for ile
        System.out.println("Number: ");
        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial: " + factorial);*/

        /* 1ci task while ile
        System.out.println("Number: ");
        int num = scanner.nextInt();

        int factorial = 1;

        int i = 1;
        while (i <= num) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial: " + factorial); */


         // 2ci task
        System.out.println("Number: ");
        int num = scanner.nextInt();

        int original = num;
        int reversed = 0;

        while (num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if (original == reversed){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome" );
        }
    }
}

