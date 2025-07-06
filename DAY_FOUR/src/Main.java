import accessmodifiers.Executor;
import crosspackage.CrossPackageExecutor;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * DAY FOUR - Access Modifiers and Package Concepts
 * Central execution point with menu-driven interface
 *
 * @author Suhas Nidgundi
 * @date July 6, 2025
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                    JAVA DAY FOUR                        ║");
        System.out.println("║            Access Modifiers & Package Concepts          ║");
        System.out.println("║                  By: Suhas Nidgundi                     ║");
        System.out.println("║                  Date: July 6, 2025                     ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        boolean continueProgram = true;

        while (continueProgram) {
            displayMenu();

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        runSamePackageDemo();
                        break;
                    case 2:
                        runCrossPackageDemo();
                        break;
                    case 3:
                        demonstrateAccessModifierSummary();
                        break;
                    case 4:
                        demonstratePackageStructure();
                        break;
                    case 5:
                        continueProgram = false;
                        System.out.println("🎓 Thanks for learning Access Modifiers with us! 👋");
                        break;
                    default:
                        System.out.println("❌ Invalid choice! Please select 1-6.");
                }

                if (continueProgram) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number between 1-6.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    MAIN MENU");
        System.out.println("=".repeat(60));
        System.out.println("1. 📦 Same Package Access Demo");
        System.out.println("2. 🌐 Cross Package Access Demo");
        System.out.println("3. 📋 Access Modifier Summary");
        System.out.println("4. 🏗️  Package Structure Overview");
        System.out.println("5. 🚪 Exit");
        System.out.println("=".repeat(60));
        System.out.print("Enter your choice (1-6): ");
    }

    private static void runSamePackageDemo() {
        System.out.println("\n🚀 Starting Same Package Access Demo...\n");
        Executor.main(new String[]{});
    }

    private static void runCrossPackageDemo() {
        System.out.println("\n🚀 Starting Cross Package Access Demo...\n");
        CrossPackageExecutor.main(new String[]{});
    }

    private static void demonstrateAccessModifierSummary() {
        System.out.println("\n📋 ACCESS MODIFIER SUMMARY");
        System.out.println("=" + "=".repeat(50));

        System.out.println("┌─────────────┬─────────────┬─────────────┬─────────────┬─────────────┐");
        System.out.println("│   Modifier  │ Same Class  │Same Package │ Subclass    │ Different   │");
        System.out.println("│             │             │             │(Diff Pkg)   │ Package     │");
        System.out.println("├─────────────┼─────────────┼─────────────┼─────────────┼─────────────┤");
        System.out.println("│   PUBLIC    │     ✅      │     ✅      │     ✅      │     ✅      │");
        System.out.println("│  PROTECTED  │     ✅      │     ✅      │     ✅      │     ❌      │");
        System.out.println("│   DEFAULT   │     ✅      │     ✅      │     ❌      │     ❌      │");
        System.out.println("│   PRIVATE   │     ✅      │     ❌      │     ❌      │     ❌      │");
        System.out.println("└─────────────┴─────────────┴─────────────┴─────────────┴─────────────┘");

        System.out.println("\n🔍 Detailed Explanation:");
        System.out.println("🌍 PUBLIC: Accessible from anywhere in the application");
        System.out.println("🛡️ PROTECTED: Package access + inheritance across packages");
        System.out.println("🔓 DEFAULT: Only within the same package (package-private)");
        System.out.println("🔒 PRIVATE: Only within the same class");
    }

    private static void demonstratePackageStructure() {
        System.out.println("\n🏗️ PACKAGE STRUCTURE OVERVIEW");
        System.out.println("=" + "=".repeat(50));

        System.out.println("📁 com.tnsif.dayfour/");
        System.out.println("├── 📄 Main.java                    (Central controller)");
        System.out.println("├── 📁 accessmodifiers/");
        System.out.println("│   ├── 📄 Base.java                (Core access demo class)");
        System.out.println("│   └── 📄 Executor.java (Same package access)");
        System.out.println("├── 📁 crosspackage/");
        System.out.println("│   └── 📄 CrossPackageExecutor.java(Different package access)");
    }
}