import java.util.Scanner;

public class DecisionMaking {

    public static void demonstrateDecisionMaking() {
        Scanner scanner = new Scanner(System.in);

        // Simple if-else demonstration
        System.out.println("=== Simple If-Else Demo ===");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        // Nested if demonstration
        System.out.println("\n=== Nested If Demo ===");
        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks >= 0 && marks <= 100) {
            if (marks >= 90) {
                System.out.println("Grade: A+ (Excellent)");
            } else if (marks >= 80) {
                System.out.println("Grade: A (Very Good)");
            } else if (marks >= 70) {
                System.out.println("Grade: B+ (Good)");
            } else if (marks >= 60) {
                System.out.println("Grade: B (Average)");
            } else if (marks >= 50) {
                System.out.println("Grade: C (Below Average)");
            } else {
                System.out.println("Grade: F (Fail)");
            }
        } else {
            System.out.println("Invalid marks! Please enter between 0-100.");
        }

        // Switch case demonstration
        System.out.println("\n=== Switch Case Demo ===");
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday - Start of the work week!");
                break;
            case 2:
                System.out.println("Tuesday - Keep going!");
                break;
            case 3:
                System.out.println("Wednesday - Midweek!");
                break;
            case 4:
                System.out.println("Thursday - Almost there!");
                break;
            case 5:
                System.out.println("Friday - TGIF!");
                break;
            case 6:
                System.out.println("Saturday - Weekend!");
                break;
            case 7:
                System.out.println("Sunday - Rest day!");
                break;
            default:
                System.out.println("Invalid day! Please enter 1-7.");
        }

        // Ternary operator demonstration
        System.out.println("\n=== Ternary Operator Demo ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result);

        // Enhanced switch (Java 14+) demonstration
        System.out.println("\n=== Enhanced Switch Demo ===");
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();

        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };

        System.out.println("Season: " + season);
    }
}