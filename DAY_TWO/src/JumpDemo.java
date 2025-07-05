import java.util.Scanner;


public class JumpDemo {

    public static void demonstrateJumpStatements() {
        Scanner scanner = new Scanner(System.in);

        // Break statement demonstration
        System.out.println("=== Break Statement Demo ===");
        System.out.println("Finding first number divisible by 7 between 1-50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("Found: " + i);
                break; // Exit the loop when the first match is found
            }
        }

        // Continue statement demonstration
        System.out.println("\n=== Continue Statement Demo ===");
        System.out.println("Printing odd numbers between 1-20:");

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Labeled break demonstration
        System.out.println("\n=== Labeled Break Demo ===");
        System.out.println("Multiplication table with labeled break:");

        outerLoop: for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j > 20) {
                    System.out.println("\nBreaking outer loop when product > 20");
                    break outerLoop;
                }
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // Labeled continue demonstration
        System.out.println("\n=== Labeled Continue Demo ===");
        System.out.println("Skipping rows where i is even:");

        outerLoop2: for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                continue outerLoop2; // Skip the entire row for even i
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // Return statement demonstration
        System.out.println("\n=== Return Statement Demo ===");
        System.out.print("Enter a number to check if it's prime: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Break in switch demonstration
        System.out.println("\n=== Break in Switch Demo ===");
        System.out.print("Enter operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }
    }

    // Helper method demonstrating return statement
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Return immediately for non-prime cases
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Return as soon as divisor is found
            }
        }

        return true; // Return true if no divisors found
    }
}