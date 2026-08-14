package foundation;

import java.util.Scanner;

public class CalculatorLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int a = scanner.nextInt();

        System.out.println("operator: ");
        String operator = scanner.next();

        System.out.println("Second number: ");
        int b = scanner.nextInt();

        switch (operator){
            case "+":
                System.out.println("Result: " + (a + b));
                break;
            case "-":
                System.out.println("Result: " + (a - b));
                break;
            case "*":
                System.out.println("Result: " + (a * b));
                break;
            case "/":
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");

        }

    }
}
