import java.util.Scanner;

public class EncapsulationDemo {

    public static void demonstrate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Encapsulation Demonstration ===");

        // Creating a BankAccount object
        BankAccount account = new BankAccount("12345", "John Doe");

        System.out.println("Initial Account Details:");
        account.displayAccountInfo();

        // Demonstrating encapsulation with deposit
        System.out.print("\nEnter amount to deposit: $");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Demonstrating encapsulation with withdrawal
        System.out.print("Enter amount to withdraw: $");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Trying to set invalid balance (this should fail due to encapsulation)
        System.out.println("\n=== Data Protection Demo ===");
        System.out.println("Attempting to set negative balance directly...");
        // account.balance = -1000; // This would cause compilation error
        System.out.println("Cannot access private balance directly - Encapsulation working!");

        // Using getter methods
        System.out.println("\nAccessing data through getter methods:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + account.getBalance());

        // Person class demonstration
        System.out.println("\n=== Person Class Demo ===");
        Person person = new Person();

        System.out.print("Enter person's name: ");
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Enter person's age: ");
        int age = scanner.nextInt();
        person.setAge(age);

        System.out.print("Enter person's email: ");
        scanner.nextLine(); // consume newline
        String email = scanner.nextLine();
        person.setEmail(email);

        System.out.println("\nPerson Details:");
        person.displayPersonInfo();

        // Testing validation
        System.out.println("\n=== Validation Demo ===");
        System.out.println("Trying to set invalid age (-5):");
        person.setAge(-5);

        System.out.println("Trying to set invalid email (invalid-email):");
        person.setEmail("invalid-email");
    }
}

/**
 * BankAccount class demonstrating encapsulation
 */
class BankAccount {
    // Private instance variables (encapsulated)
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Getter methods (public access to private data)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method with validation
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Invalid account holder name!");
        }
    }

    // Controlled methods for balance modification
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

/**
 * Person class with validation in setter methods
 */
class Person {
    private String name;
    private int age;
    private String email;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name! Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Age must be between 0 and 150.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}