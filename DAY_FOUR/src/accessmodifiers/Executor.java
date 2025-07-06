package accessmodifiers;

public class Executor {

    public static void main(String[] args) {
        System.out.println("📦 SAME PACKAGE ACCESS DEMONSTRATION");
        System.out.println("=" + "=".repeat(55));

        // Creating a Base class object
        Base baseObj = new Base();

        System.out.println("🔍 Accessing Base class from same package:");

        // Accessing public members - ✅ ALLOWED
        System.out.println("\n✅ PUBLIC ACCESS:");
        System.out.println("   Public variable: " + baseObj.varPublic);
        baseObj.methodPublic();

        // Accessing protected members - ✅ ALLOWED (same package)
        System.out.println("\n✅ PROTECTED ACCESS:");
        System.out.println("   Protected variable: " + baseObj.varProtected);
        baseObj.methodProtected();

        // Accessing default (package-private) members - ✅ ALLOWED
        System.out.println("\n✅ DEFAULT (PACKAGE-PRIVATE) ACCESS:");
        System.out.println("   Default variable: " + baseObj.varDefault);
        baseObj.methodDefault();

        // Accessing private members - ❌ NOT ALLOWED
        System.out.println("\n❌ PRIVATE ACCESS:");
        System.out.println("   Cannot access private members directly!");
        // System.out.println(baseObj.varPrivate);     // Compilation error
        // baseObj.methodPrivate();                    // Compilation error

        // But can access through a public method
        baseObj.demonstratePrivateAccess();

        // Modifying accessible variables
        System.out.println("\n🔧 MODIFYING ACCESSIBLE VARIABLES:");
        baseObj.varPublic = 200;
        baseObj.varProtected = 300;
        baseObj.varDefault = 100;
        // baseObj.varPrivate = 400;  // Not accessible

        System.out.println("After modification:");
        baseObj.methodPublic();
        baseObj.methodProtected();
        baseObj.methodDefault();

        // Show a complete access demo
        baseObj.showAllAccess();
    }
}