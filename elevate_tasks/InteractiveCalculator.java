package elevate_tasks;

import java.util.Scanner;

public class InteractiveCalculator {

    static String appName = "Human Style Calculator";
    int operationsPerformed = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the " + appName + " 🌟");
        System.out.println("Let’s collect some values directly from YOU.\n");

        // ---- Taking Primitive Data Types from User ----

        System.out.print("Enter a byte value (small number): ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter an integer value: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();

        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a single character: ");
        char charValue = scanner.next().charAt(0);

        System.out.print("Enter true or false: ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("\nNice! Here’s what you entered:");
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);

        // ---- Calculator Section ----

        System.out.println("\nNow let’s do some math magic ✨");

        System.out.print("Enter first number: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("That doesn’t look like a number. Restart and try again!");
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Oops… invalid input detected.");
            return;
        }
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        System.out.println("\nHere come your results:");

        System.out.printf("Addition: %.2f%n", sum);
        System.out.printf("Subtraction: %.2f%n", diff);
        System.out.printf("Multiplication: %.2f%n", product);

        if (num2 != 0) {
            System.out.printf("Division: %.2f%n", (num1 / num2));
        } else {
            System.out.println("Division by zero? Nah, we don’t do that here.");
        }

        // ---- Type Casting Section ----

        System.out.println("\nTime for some type casting glow-up:");

        int casted = (int) sum;
        System.out.println("Double result cast to int: " + casted);

        char toChar = (char) casted;
        System.out.println("That integer as a character: " + toChar);

        scanner.nextLine(); // clearing buffer

        System.out.print("\nType a number in text form: ");
        String textInput = scanner.nextLine();

        try {
            int parsed = Integer.parseInt(textInput);
            System.out.println("Converted successfully: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Couldn’t convert that text into a number. No worries.");
        }

        // ---- Static vs Instance Variables ----

        InteractiveCalculator obj = new InteractiveCalculator();
        obj.operationsPerformed++;

        System.out.println("\nConcept Check:");
        System.out.println("Static variable (shared): " + appName);
        System.out.println("Instance variable (unique to object): " + obj.operationsPerformed);

        System.out.println("\nThanks for spending time with this program. Keep exploring 🚀");

        scanner.close();
    }
}
