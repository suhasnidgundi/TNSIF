package accessmodifiers;

public class Base {

    // Declare default, private, protected and public variables
    int varDefault = 10;                    // Package-private access
    public int varPublic = 20;              // Public access
    private int varPrivate = 30;            // Private access
    protected int varProtected = 40;        // Protected access

    // Declare default, protected, public and private methods

    /**
     * Default (package-private) access method
     */
    void methodDefault() {
        System.out.println("🔓 Default access base class method");
        System.out.println("   Default variable value: " + varDefault);
    }

    /**
     * Public access method - accessible from anywhere
     */
    public void methodPublic() {
        System.out.println("🌍 Public access base class method");
        System.out.println("   Public variable value: " + varPublic);
    }

    /**
     * Private access method - only accessible within this class
     */
    private void methodPrivate() {
        System.out.println("🔒 Private access base class method");
        System.out.println("   Private variable value: " + varPrivate);
    }

    /**
     * Protected access method - accessible within package and subclasses
     */
    protected void methodProtected() {
        System.out.println("🛡️ Protected access base class method");
        System.out.println("   Protected variable value: " + varProtected);
    }

    /**
     * Public method to demonstrate private access from within same class
     */
    public void demonstratePrivateAccess() {
        System.out.println("\n📋 Accessing private members from within same class:");
        System.out.println("   Private variable: " + varPrivate);
        methodPrivate();
    }

    /**
     * Method to show all accessible members within same class
     */
    public void showAllAccess() {
        System.out.println("\n🏠 All access modifiers within same class (Base):");
        System.out.println("   ✅ Public variable: " + varPublic);
        System.out.println("   ✅ Protected variable: " + varProtected);
        System.out.println("   ✅ Default variable: " + varDefault);
        System.out.println("   ✅ Private variable: " + varPrivate);

        System.out.println("\n   Calling all methods:");
        methodPublic();
        methodProtected();
        methodDefault();
        methodPrivate();
    }
}