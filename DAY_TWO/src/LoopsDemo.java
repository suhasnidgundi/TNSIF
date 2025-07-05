import java.util.Scanner;

public class LoopsDemo {

    public static void demonstrateLoops() {
        Scanner scanner = new Scanner(System.in);

        // For loop demonstration
        System.out.println("=== For Loop Demo ===");
        System.out.print("Enter a number for multiplication table: ");
        int tableNum = scanner.nextInt();

        System.out.println("Multiplication table of " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }

        // While loop demonstration
        System.out.println("\n=== While Loop Demo ===");
        System.out.print("Enter a number to find its factorial: ");
        int factNum = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= factNum) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + factNum + " = " + factorial);

        // Do-while loop demonstration
        System.out.println("\n=== Do-While Loop Demo ===");
        System.out.println("Number guessing game (1-10):");

        int secretNumber = (int) (Math.random() * 10) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != secretNumber);

        // Enhanced for loop demonstration
        System.out.println("\n=== Enhanced For Loop Demo ===");
        int[] numbers = {10, 25, 30, 45, 50, 75, 80, 95};

        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Even numbers from array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Nested loops demonstration
        System.out.println("\n=== Nested Loops Demo ===");
        System.out.print("Enter size for pattern: ");
        int size = scanner.nextInt();

        System.out.println("Star pattern:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Infinite loop with break demonstration
        System.out.println("\n=== Menu-driven Demo (Infinite Loop with Break) ===");

        while (true) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        // Loop performance comparison
        System.out.println("\n=== Loop Performance Demo ===");
        demonstrateLoopPerformance();
    }

    private static void demonstrateLoopPerformance() {
        final int ITERATIONS = 1000000;

        // For loop timing
        long startTime = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            sum1 += i;
        }
        long endTime = System.nanoTime();
        System.out.println("For loop time: " + (endTime - startTime) / 1000000.0 + " ms");

        // While loop timing
        startTime = System.nanoTime();
        int sum2 = 0;
        int j = 0;
        while (j < ITERATIONS) {
            sum2 += j;
            j++;
        }
        endTime = System.nanoTime();
        System.out.println("While loop time: " + (endTime - startTime) / 1000000.0 + " ms");

        System.out.println("Both loops calculated sum: " + sum1 + " (verification: " + sum2 + ")");
    }
}