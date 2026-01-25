package elevate_tasks;

import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 1. Read size of single-dimensional array
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            int[] numbers = new int[n];

            // Input elements
            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }

            // 2. Perform sum, average, max, min
            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            for (int i = 0; i < n; i++) {
                sum += numbers[i];

                if (numbers[i] > max) {
                    max = numbers[i];
                }

                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            double average = (double) sum / n;

            // 3. Manual sorting (Bubble Sort - Ascending Order)
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }

            // 4. Multi-dimensional array input
            System.out.print("\nEnter number of rows for 2D array: ");
            int rows = sc.nextInt();

            System.out.print("Enter number of columns for 2D array: ");
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter elements of 2D array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // 7. Display formatted output
            System.out.println("\n----- Results -----");
            System.out.println("Sum     : " + sum);
            System.out.println("Average : " + average);
            System.out.println("Maximum : " + max);
            System.out.println("Minimum : " + min);

            System.out.print("\nSorted Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[i] + " ");
            }

            System.out.println("\n\n2D Array Elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // 5. Demonstrating ArrayIndexOutOfBoundsException
            System.out.println("\nAccessing invalid index to demonstrate exception:");
            System.out.println(numbers[n]); // Invalid index

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }

        sc.close();
    }
}
