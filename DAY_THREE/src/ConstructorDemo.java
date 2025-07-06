import java.util.Scanner;

public class ConstructorDemo {

    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Constructor Demonstrations ===");

        // Default constructor
        System.out.println("1. Default Constructor:");
        Book book1 = new Book();
        book1.displayBook();

        // Parameterized constructor
        System.out.println("\n2. Parameterized Constructor:");
        Book book2 = new Book("Java Programming", "James Gosling", 599.99);
        book2.displayBook();

        // Constructor overloading
        System.out.println("\n3. Constructor Overloading:");
        Book book3 = new Book("Python Basics", "Guido van Rossum");
        book3.displayBook();

        // User input for creating book
        System.out.println("\n4. Create your own book:");
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Book userBook = new Book(title, author, price);
        System.out.println("\nYour book details:");
        userBook.displayBook();

        // Demonstrating constructor chaining
        System.out.println("\n=== Constructor Chaining Demo ===");
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("John Doe");
        Employee emp3 = new Employee("Jane Smith", 50000);
        Employee emp4 = new Employee("Bob Johnson", 75000, "IT");

        System.out.println("\nEmployee Details:");
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp4.displayEmployee();
    }
}

/**
 * Book class demonstrating constructor concepts
 */
class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor with all parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor (3 params) called");
    }

    // Constructor overloading - only title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 299.99; // Default price
        System.out.println("Parameterized constructor (2 params) called");
    }

    // Method to display book information
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

/**
 * Employee class demonstrating constructor chaining
 */
class Employee {
    private String name;
    private double salary;
    private String department;

    // Default constructor
    public Employee() {
        this("Unknown Employee"); // Calling another constructor
    }

    // Constructor with name only
    public Employee(String name) {
        this(name, 30000); // Calling another constructor
    }

    // Constructor with name and salary
    public Employee(String name, double salary) {
        this(name, salary, "General"); // Calling another constructor
    }

    // Constructor with all parameters
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + ", Salary: $" + salary +
                ", Department: " + department);
    }
}