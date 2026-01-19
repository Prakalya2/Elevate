package elevate_tasks;
import java.util.Scanner;

public class StudentResultSystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Student Result Processing System");

        while (true) {

            System.out.print("\nEnter Student Name: ");
            String name = sc.nextLine();

            int totalMarks = getMarks();

            double percentage = calculatePercentage(totalMarks);

            char grade = assignGrade(percentage);

            displayResult(name, totalMarks, percentage, grade);

            System.out.print("\nDo you want to enter another student? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("System shutting down... Stay awesome!");
                break;
            } else if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Invalid choice! Exiting for safety.");
                break;
            }
        }
    }

    // Method to take and validate marks
    static int getMarks() {
        int marks;
        while (true) {
            System.out.print("Enter marks out of 500: ");
            marks = sc.nextInt();
            sc.nextLine();   // clear buffer

            if (marks < 0 || marks > 500) {
                System.out.println("Invalid marks! Range should be 0 to 500.");
                continue;   // retry input
            }
            break;
        }
        return marks;
    }

    // Method to calculate percentage
    static double calculatePercentage(int total) {
        return (total / 500.0) * 100;
    }

    // Method to assign grade using if-else and switch
    static char assignGrade(double percentage) {

        int gradePoint;

        if (percentage >= 90)
            gradePoint = 1;
        else if (percentage >= 80)
            gradePoint = 2;
        else if (percentage >= 70)
            gradePoint = 3;
        else if (percentage >= 60)
            gradePoint = 4;
        else if (percentage >= 50)
            gradePoint = 5;
        else
            gradePoint = 6;

        char grade;

        switch (gradePoint) {
            case 1:
                grade = 'A';
                break;
            case 2:
                grade = 'B';
                break;
            case 3:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }

        return grade;
    }

    // Method to display final summary
    static void displayResult(String name, int total, double percentage, char grade) {

        System.out.println("/n RESULT");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total + "/500");
        System.out.printf("Percentage   : %.2f%%\n", percentage);
        System.out.println("Grade        : " + grade);
    }
}