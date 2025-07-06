import examples.EmployeeExample;
import finaldemo.FinalClassDemo;
import finaldemo.FinalMethodDemo;
import finaldemo.FinalVariableDemo;
import staticdemo.StaticBlock;
import staticdemo.StaticMethod;
import staticdemo.StaticVariable;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            displayMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        demonstrateStaticVariables();
                        break;
                    case 2:
                        demonstrateStaticMethods();
                        break;
                    case 3:
                        demonstrateStaticBlocks();
                        break;
                    case 4:
                        demonstrateFinalVariables();
                        break;
                    case 5:
                        demonstrateFinalMethods();
                        break;
                    case 6:
                        demonstrateFinalClasses();
                        break;
                    case 7:
                        demonstrateEmployeeExample();
                        break;
                    case 8:
                        demonstrateStaticFinalCombination();
                        break;
                    case 9:
                        continueProgram = false;
                        System.out.println("🎓 Thanks for learning Static & Final concepts with us! 👋");
                        break;
                    default:
                        System.out.println("❌ Invalid choice! Please select 1-9.");
                }

                if (continueProgram) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number between 1-9.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    MAIN MENU");
        System.out.println("=".repeat(60));
        System.out.println("1. ⚡ Static Variables Demo");
        System.out.println("2. 🔧 Static Methods Demo");
        System.out.println("3. 🏗️  Static Blocks Demo");
        System.out.println("4. 🔒 Final Variables Demo");
        System.out.println("5. 🛡️  Final Methods Demo");
        System.out.println("6. 🏛️  Final Classes Demo");
        System.out.println("7. 👨‍💼 Employee Example (Static)");
        System.out.println("8. 💎 Static + Final Combination");
        System.out.println("9. 🚪 Exit");
        System.out.println("=".repeat(60));
        System.out.print("Enter your choice (1-9): ");
    }

    private static void demonstrateStaticVariables() {
        System.out.println("\n⚡ STATIC VARIABLES DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        StaticVariable.demonstrate();
    }

    private static void demonstrateStaticMethods() {
        System.out.println("\n🔧 STATIC METHODS DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        StaticMethod.demonstrate();
    }

    private static void demonstrateStaticBlocks() {
        System.out.println("\n🏗️ STATIC BLOCKS DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        StaticBlock.demonstrate();
    }

    private static void demonstrateFinalVariables() {
        System.out.println("\n🔒 FINAL VARIABLES DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        FinalVariableDemo.demonstrate();
    }

    private static void demonstrateFinalMethods() {
        System.out.println("\n🛡️ FINAL METHODS DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        FinalMethodDemo.demonstrate();
    }

    private static void demonstrateFinalClasses() {
        System.out.println("\n🏛️ FINAL CLASSES DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        FinalClassDemo.demonstrate();
    }

    private static void demonstrateEmployeeExample() {
        System.out.println("\n👨‍💼 EMPLOYEE EXAMPLE (STATIC COMPANY NAME)");
        System.out.println("=" + "=".repeat(50));

        EmployeeExample.demonstrate();
    }

    private static void demonstrateStaticFinalCombination() {
        System.out.println("\n💎 STATIC + FINAL COMBINATION");
        System.out.println("=" + "=".repeat(50));

        System.out.println("🔍 Key Concepts:");
        System.out.println("✅ static final: Constants (like Math.PI)");
        System.out.println("✅ Initialized once and shared across all instances");
        System.out.println("✅ Memory efficient for constants");
        System.out.println("✅ Cannot be changed after initialization");

        System.out.println("\n📝 Examples:");
        System.out.println("• public static final double PI = 3.14159;");
        System.out.println("• public static final String COMPANY_NAME = \"TNSIF\";");
        System.out.println("• public static final int MAX_SIZE = 100;");
    }
}