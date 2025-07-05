import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("      JAVA FUNDAMENTALS - DAY TWO      ");
            System.out.println("========================================");
            System.out.println("1. Decision Making Demo");
            System.out.println("2. Jump Statements Demo");
            System.out.println("3. Loops Demo");
            System.out.println("4. Operations Demo");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Decision Making Demo ---");
                    DecisionMaking.demonstrateDecisionMaking();
                    break;

                case 2:
                    System.out.println("\n--- Jump Statements Demo ---");
                    JumpDemo.demonstrateJumpStatements();
                    break;

                case 3:
                    System.out.println("\n--- Loops Demo ---");
                    LoopsDemo.demonstrateLoops();
                    break;

                case 4:
                    System.out.println("\n--- Operations Demo ---");
                    OperationDemo.demonstrateOperations();
                    break;

                case 0:
                    System.out.println("Thank you for using Java Fundamentals Demo!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 0-4.");
            }

            if (choice != 0) {
                System.out.println("\nPress Enter to continue...");
                try {
                    System.in.read();
                } catch (Exception e) {
                    // Handle exception silently
                }
            }

        } while (choice != 0);

        scanner.close();
    }
}