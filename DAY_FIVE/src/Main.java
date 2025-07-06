import association.Association;
import hierarchicalinheritance.HierarchicalInheritance;
import multilevelinheritance.MultilevelInheritance;
import overriding.MethodOverriding;
import singleinheritance.SingleInheritance;

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
                        demonstrateSingleInheritance();
                        break;
                    case 2:
                        demonstrateMultilevelInheritance();
                        break;
                    case 3:
                        demonstrateHierarchicalInheritance();
                        break;
                    case 4:
                        demonstrateAssociation();
                        break;
                    case 5:
                        demonstrateMethodOverriding();
                        break;
                    case 6:
                        demonstrateInheritanceBenefits();
                        break;
                    case 7:
                        continueProgram = false;
                        System.out.println("🎓 Thanks for learning Inheritance with us! 👋");
                        break;
                    default:
                        System.out.println("❌ Invalid choice! Please select 1-7.");
                }

                if (continueProgram) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number between 1-7.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("                    MAIN MENU");
        System.out.println("=".repeat(60));
        System.out.println("1. 🔗 Single Inheritance Demo");
        System.out.println("2. 📈 Multilevel Inheritance Demo");
        System.out.println("3. 🌳 Hierarchical Inheritance Demo");
        System.out.println("4. 🤝 Association (Has-A) Demo");
        System.out.println("5. 🔄 Method Overriding Demo");
        System.out.println("6. 💡 Inheritance Benefits");
        System.out.println("7. 🚪 Exit");
        System.out.println("=".repeat(60));
        System.out.print("Enter your choice (1-7): ");
    }

    private static void demonstrateSingleInheritance() {
        System.out.println("\n🔗 SINGLE INHERITANCE DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));
        System.out.println("Parent Class: Citizen → Child Class: Student");

        SingleInheritance.demonstrate();
    }

    private static void demonstrateMultilevelInheritance() {
        System.out.println("\n📈 MULTILEVEL INHERITANCE DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));
        System.out.println("Grandparent: Country → Parent: State → Child: City");

        MultilevelInheritance.demonstrate();
    }

    private static void demonstrateHierarchicalInheritance() {
        System.out.println("\n🌳 HIERARCHICAL INHERITANCE DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));
        System.out.println("Parent: Person → Children: Employee & Student");

        HierarchicalInheritance.demonstrate();
    }

    private static void demonstrateAssociation() {
        System.out.println("\n🤝 ASSOCIATION (HAS-A RELATIONSHIP) DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));
        System.out.println("Person HAS-A Address (Composition)");

        Association.demonstrate();
    }

    private static void demonstrateMethodOverriding() {
        System.out.println("\n🔄 METHOD OVERRIDING DEMONSTRATION");
        System.out.println("=" + "=".repeat(50));

        MethodOverriding.demonstrate();
    }

    private static void demonstrateInheritanceBenefits() {
        System.out.println("\n💡 INHERITANCE BENEFITS & CONCEPTS");
        System.out.println("=" + "=".repeat(50));

        System.out.println("🔍 Types of Inheritance in Java:");
        System.out.println("1. ✅ Single Inheritance: A → B");
        System.out.println("2. ✅ Multilevel Inheritance: A → B → C");
        System.out.println("3. ✅ Hierarchical Inheritance: A → B, A → C");
        System.out.println("4. ❌ Multiple Inheritance: Not supported (Diamond Problem)");
        System.out.println("5. ❌ Hybrid Inheritance: Not supported directly");
    }
}