public class AccessModifiersDemo {

    public static void demonstrate() {
        System.out.println("=== Access Modifiers Demonstration ===");

        // Creating objects to test access modifiers
        AccessExample obj = new AccessExample();

        // Public access - accessible from anywhere
        System.out.println("1. Public Access:");
        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();

        // Package-private (default) access - accessible within same package
        System.out.println("\n2. Package-Private Access:");
        System.out.println("Package variable: " + obj.packageVar);
        obj.packageMethod();

        // Protected access - accessible within same package and subclasses
        System.out.println("\n3. Protected Access:");
        System.out.println("Protected variable: " + obj.protectedVar);
        obj.protectedMethod();

        // Private access - only accessible within the same class
        System.out.println("\n4. Private Access:");
        // System.out.println(obj.privateVar); // This would cause compilation error
        // obj.privateMethod(); // This would cause compilation error
        System.out.println("Private members cannot be accessed directly!");
        System.out.println("Accessing private variable through public method: " +
                obj.getPrivateVar());
        obj.usePrivateMethod();

        // Inheritance and access modifiers
        System.out.println("\n=== Inheritance and Access Modifiers ===");
        SubClassExample subObj = new SubClassExample();
        subObj.demonstrateInheritedAccess();

        // Different package simulation
        System.out.println("\n=== Different Package Simulation ===");
        simulateDifferentPackageAccess();
    }

    private static void simulateDifferentPackageAccess() {
        System.out.println("Note: In a different package, only public members would be accessible");
        System.out.println("- Public: ✓ Accessible");
        System.out.println("- Protected: ✗ Not accessible (unless inherited)");
        System.out.println("- Package-private: ✗ Not accessible");
        System.out.println("- Private: ✗ Not accessible");
    }
}

/**
 * Class demonstrating different access modifiers
 */
class AccessExample {
    // Different access modifiers
    public String publicVar = "I am public";
    protected String protectedVar = "I am protected";
    String packageVar = "I am package-private"; // default access
    private final String privateVar = "I am private";

    // Public method - accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method called");
    }

    // Protected method - accessible within same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    // Package-private method - accessible within same package
    void packageMethod() {
        System.out.println("Package-private method called");
    }

    // Private method - only accessible within this class
    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Public method to access private variable
    public String getPrivateVar() {
        return privateVar;
    }

    // Public method to use private method
    public void usePrivateMethod() {
        System.out.println("Calling private method from within the class:");
        privateMethod();
    }

    // Method demonstrating access within same class
    public void demonstrateInternalAccess() {
        System.out.println("=== Access Within Same Class ===");
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Package: " + packageVar);
        System.out.println("Private: " + privateVar);

        publicMethod();
        protectedMethod();
        packageMethod();
        privateMethod();
    }
}

/**
 * Subclass demonstrating inheritance and access modifiers
 */
class SubClassExample extends AccessExample {

    public void demonstrateInheritedAccess() {
        System.out.println("=== Access in Subclass ===");

        // Can access public, protected, and package-private from parent
        System.out.println("Inherited public: " + publicVar);
        System.out.println("Inherited protected: " + protectedVar);
        System.out.println("Inherited package: " + packageVar);

        // Cannot access private from parent
        // System.out.println("Inherited private: " + privateVar); // Compilation error
        System.out.println("Cannot access private members from parent class");

        // Calling inherited methods
        publicMethod();
        protectedMethod();
        packageMethod();
        // privateMethod(); // Compilation error

        // But can access private through public method
        System.out.println("Private via public method: " + getPrivateVar());
    }

    // Overriding protected method
    @Override
    protected void protectedMethod() {
        System.out.println("Overridden protected method in subclass");
        super.protectedMethod(); // Calling parent's version
    }
}

/**
 * Utility class demonstrating proper encapsulation
 */
class BankAccountSecure {
    // Private fields for security
    private final String accountNumber;
    private double balance;
    private final String pin;

    // Public constructor
    public BankAccountSecure(String accountNumber, String pin) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = 0.0;
    }

    // Public methods for controlled access
    public boolean deposit(double amount, String enteredPin) {
        if (validatePin(enteredPin) && amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, String enteredPin) {
        if (validatePin(enteredPin) && amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance(String enteredPin) {
        if (validatePin(enteredPin)) {
            return balance;
        }
        return -1; // Invalid access
    }

    // Private helper method
    private boolean validatePin(String enteredPin) {
        return this.pin.equals(enteredPin);
    }

    // Public method with limited access
    public String getAccountNumber() {
        return accountNumber; // Account number can be public
    }
}