import java.util.Scanner;

public class ClassAndObjectDemo {

    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Creating Student Objects ===");

        // Creating objects using default constructor
        Student student1 = new Student();
        Student student2 = new Student();

        // Setting values for first student
        System.out.print("Enter details for Student 1:\nName: ");
        student1.name = scanner.nextLine();
        System.out.print("Roll Number: ");
        student1.rollNumber = scanner.nextInt();
        System.out.print("Age: ");
        student1.age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Setting values for second student
        System.out.print("\nEnter details for Student 2:\nName: ");
        student2.name = scanner.nextLine();
        System.out.print("Roll Number: ");
        student2.rollNumber = scanner.nextInt();
        System.out.print("Age: ");
        student2.age = scanner.nextInt();

        // Displaying student information
        System.out.println("\n=== Student Information ===");
        student1.displayInfo();
        student2.displayInfo();

        // Demonstrating method calls
        System.out.println("\n=== Method Demonstrations ===");
        student1.study("Mathematics");
        student2.study("Physics");

        // Creating a Car object
        System.out.println("\n=== Car Object Demo ===");
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2023;

        car.displayCarInfo();
        car.startEngine();
        car.drive();
        car.stopEngine();

        // Object reference demonstration
        System.out.println("\n=== Object Reference Demo ===");
        Student student3 = student1; // Both variables refer to the same object
        System.out.println("student1 name: " + student1.name);
        System.out.println("student3 name: " + student3.name);

        student3.name = "Modified Name";
        System.out.println("After modifying student3:");
        System.out.println("student1 name: " + student1.name);
        System.out.println("student3 name: " + student3.name);
    }
}

/**
 * Student class demonstrating basic class structure
 */
class Student {
    // Instance variables (attributes)
    String name;
    int rollNumber;
    int age;

    // Instance method to display student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age + " years");
        System.out.println();
    }

    // Instance method with parameter
    void study(String subject) {
        System.out.println(name + " is studying " + subject);
    }

    // Method to calculate birth year (approximate)
    int getBirthYear() {
        return 2025 - age;
    }
}

/**
 * Car class for additional object demonstration
 */
class Car {
    // Instance variables
    String brand;
    String model;
    int year;
    boolean isEngineRunning = false;

    // Method to display car information
    void displayCarInfo() {
        System.out.println("Car: " + year + " " + brand + " " + model);
    }

    // Method to start engine
    void startEngine() {
        if (!isEngineRunning) {
            isEngineRunning = true;
            System.out.println("Engine started for " + brand + " " + model);
        } else {
            System.out.println("Engine is already running!");
        }
    }

    // Method to stop engine
    void stopEngine() {
        if (isEngineRunning) {
            isEngineRunning = false;
            System.out.println("Engine stopped for " + brand + " " + model);
        } else {
            System.out.println("Engine is already stopped!");
        }
    }

    // Method to drive
    void drive() {
        if (isEngineRunning) {
            System.out.println("Driving the " + brand + " " + model);
        } else {
            System.out.println("Cannot drive! Please start the engine first.");
        }
    }
}