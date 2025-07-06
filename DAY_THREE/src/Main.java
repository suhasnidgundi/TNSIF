import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   JAVA OOP FUNDAMENTALS - DAY THREE   ");
        System.out.println("========================================");
        System.out.println("Choose a demonstration to run:");

        while (true) {
            displayMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Classes and Objects Demo ---");
                    ClassAndObjectDemo.demonstrate();
                    break;
                case 2:
                    System.out.println("\n--- Constructors Demo ---");
                    ConstructorDemo.demonstrate();
                    break;
                case 3:
                    System.out.println("\n--- Encapsulation Demo ---");
                    EncapsulationDemo.demonstrate();
                    break;
                case 4:
                    System.out.println("\n--- Method Overloading Demo ---");
                    MethodOverloadingDemo.demonstrate();
                    break;
                case 5:
                    System.out.println("\n--- Static Members Demo ---");
                    StaticMembersDemo.demonstrate();
                    break;
                case 6:
                    System.out.println("\n--- Access Modifiers Demo ---");
                    AccessModifiersDemo.demonstrate();
                    break;
                case 0:
                    System.out.println("Thank you for exploring Java OOP concepts!");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a number between 0-6.");
            }

            System.out.println("\n" + "=".repeat(50) + "\n");
            pauseExecution();
        }
    }

    private static void displayMenu() {
        System.out.println("1. Classes and Objects");
        System.out.println("2. Constructors");
        System.out.println("3. Encapsulation");
        System.out.println("4. Method Overloading");
        System.out.println("5. Static Members");
        System.out.println("6. Access Modifiers");
        System.out.println("0. Exit");
        System.out.print("Enter your choice (0-6): ");
    }

    private static int getChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear invalid input
            return -1;
        }
    }

    private static void pauseExecution() {
        System.out.println("Press Enter to continue...");
        try {
            scanner.nextLine();
            scanner.nextLine();
        } catch (Exception e) {
            // Handle exception silently
        }
    }
}