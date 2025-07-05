import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Java Fundamentals Demonstration ===");
        System.out.println("Choose a demonstration to run:");

        while (true) {
            displayMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    CharacterLiteralAndUnicode.demonstrate();
                    break;
                case 2:
                    JavaIdentifierAndNamingConvention.demonstrate();
                    break;
                case 3:
                    PrimitiveDataType.demonstrate();
                    break;
                case 4:
                    TypeConversionAndCasting.demonstrate();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println("\n" + "=".repeat(50) + "\n");
        }
    }

    private static void displayMenu() {
        System.out.println("1. Character Demonstration");
        System.out.println("2. Identifier Demonstration");
        System.out.println("3. Primitive Data Types Demonstration");
        System.out.println("4. Type Casting Demonstration");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    private static int getChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Clear invalid input
            return -1;
        }
    }
}