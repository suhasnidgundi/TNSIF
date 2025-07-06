package hierarchicalinheritance;

public class HierarchicalInheritance {
    public static void demonstrate() {
        System.out.println("🌳 Creating multiple child objects from same parent:\n");

        // Creating an Employee object
        Employee emp = new Employee("Rahul Sharma", "Mumbai", 28, 1001, 75000.0, "IT");

        // Creating a Student object
        StudentHierarchical student = new StudentHierarchical("Suhas Nidgundi", "Pune", 20, 13249, "Computer Engineering", 8.5);

        System.out.println("\n💼 Employee Information:");
        emp.displayEmployeeInfo();
        emp.work();

        System.out.println("\n🎓 Student Information:");
        student.displayStudentInfo();
        student.study();

        System.out.println("\n🔍 Hierarchical Inheritance Structure:");
        System.out.println("        Person");
        System.out.println("       /      \\");
        System.out.println("  Employee   Student");
        System.out.println("\nBoth classes inherit from Person but are independent of each other");
    }
}
