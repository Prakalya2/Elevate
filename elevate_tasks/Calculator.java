package elevate_tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator ");

        // Display menu to user
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        // Getting numbers from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Perform only the selected operation
        switch (choice) {

            case 1:
                System.out.println("Result: " + add(a, b));
                break;

            case 2:
                System.out.println("Result: " + subtract(a, b));
                break;

            case 3:
                System.out.println("Result: " + multiply(a, b));
                break;

            case 4:
                try {
                    System.out.println("Result: " + divide(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // Addition method
    public static int add(int x, int y) {
        return x + y;
    }

    // Subtraction method
    public static int subtract(int x, int y) {
        return x - y;
    }

    // Multiplication method
    public static int multiply(int x, int y) {
        return x * y;
    }

    // Division method with error check
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException();
        }
        return x / y;
    }
}
