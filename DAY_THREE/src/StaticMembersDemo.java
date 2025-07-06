import java.util.Scanner;

public class StaticMembersDemo {

    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Static Members Demonstration ===");

        // Static variable demonstration
        System.out.println("1. Static Variable Demo:");
        System.out.println("Initial student count: " + StudentRecord.getStudentCount());

        // Creating student objects
        StudentRecord student1 = new StudentRecord("Alice", 85);
        StudentRecord student2 = new StudentRecord("Bob", 92);
        StudentRecord student3 = new StudentRecord("Charlie", 78);

        System.out.println("After creating 3 students: " + StudentRecord.getStudentCount());

        // Static method demonstration
        System.out.println("\n2. Static Method Demo:");
        System.out.println("School name: " + StudentRecord.getSchoolName());
        StudentRecord.setSchoolName("Java Programming Academy");
        System.out.println("Updated school name: " + StudentRecord.getSchoolName());

        // Accessing static members through objects (not recommended)
        System.out.println("Student count via object: " + StudentRecord.getStudentCount());

        // Math utility demonstration
        System.out.println("\n3. Math Utility Demo:");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Maximum: " + MathUtility.max(num1, num2));
        System.out.println("Minimum: " + MathUtility.min(num1, num2));
        System.out.println("Average: " + MathUtility.average(num1, num2));

        System.out.print("Enter radius for circle area: ");
        double radius = scanner.nextDouble();
        System.out.println("Circle area: " + MathUtility.circleArea(radius));

        // Constants demonstration
        System.out.println("\n4. Constants Demo:");
        System.out.println("PI value: " + MathUtility.PI);
        System.out.println("Euler's number: " + MathUtility.E);

        // Static block demonstration
        System.out.println("\n5. Static Block Demo:");
        Configuration config1 = new Configuration();
        Configuration config2 = new Configuration();

        // Counter demonstration
        System.out.println("\n6. Counter Demo:");
        Counter.increment();
        Counter.increment();
        Counter.increment();
        System.out.println("Counter value: " + Counter.getValue());
        Counter.decrement();
        System.out.println("After decrement: " + Counter.getValue());
        Counter.reset();
        System.out.println("After reset: " + Counter.getValue());
    }
}

/**
 * StudentRecord class demonstrating static variables and methods
 */
class StudentRecord {
    // Static variable - shared among all instances
    private static int studentCount = 0;
    private static String schoolName = "Default School";

    // Instance variables
    private final String name;
    private final int marks;

    // Constructor
    public StudentRecord(String name, int marks) {
        this.name = name;
        this.marks = marks;
        studentCount++; // Increment static variable
        System.out.println("Student created: " + name);
    }

    // Static method to get student count
    public static int getStudentCount() {
        return studentCount;
    }

    // Static method to get/set school name
    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        StudentRecord.schoolName = schoolName;
    }

    // Instance method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Marks: " + marks +
                ", School: " + schoolName);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

/**
 * MathUtility class with static methods and constants
 */
class MathUtility {
    // Static constants
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;

    // Private constructor to prevent instantiation
    private MathUtility() {
        // Utility class should not be instantiated
    }

    // Static utility methods
    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

/**
 * Configuration class demonstrating static block
 */
class Configuration {
    private static final String version;
    private static final String buildDate;

    // Static block - executed when a class is first loaded
    static {
        System.out.println("Static block executed - Loading configuration...");
        version = "1.0.0";
        buildDate = "July 6, 2025";
        System.out.println("Configuration loaded: Version " + version +
                ", Build Date: " + buildDate);
    }

    // Constructor
    public Configuration() {
        System.out.println("Configuration object created");
    }

    public static String getVersion() {
        return version;
    }

    public static String getBuildDate() {
        return buildDate;
    }
}

/**
 * Counter class with static methods for counting
 */
class Counter {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static void decrement() {
        if (count > 0) {
            count--;
        }
    }

    public static void reset() {
        count = 0;
    }

    public static int getValue() {
        return count;
    }
}