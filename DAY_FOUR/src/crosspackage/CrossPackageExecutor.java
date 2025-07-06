package crosspackage;

import accessmodifiers.Base;

public class CrossPackageExecutor {

    public static void main(String[] args) {
        System.out.println("🌐 CROSS-PACKAGE ACCESS DEMONSTRATION");
        System.out.println("=" + "=".repeat(55));

        // Creating a Base class object from a different package
        Base baseObj = new Base();

        System.out.println("🔍 Accessing Base class from different package:");

        // Accessing public members - ✅ ALLOWED
        System.out.println("\n✅ PUBLIC ACCESS:");
        System.out.println("   Public variable: " + baseObj.varPublic);
        baseObj.methodPublic();

        // Accessing protected members - ❌ NOT ALLOWED (different package, no inheritance)
        System.out.println("\n❌ PROTECTED ACCESS:");
        System.out.println("   Cannot access protected members from different package!");
        // System.out.println(baseObj.varProtected);    // Compilation error
        // baseObj.methodProtected();                   // Compilation error

        // Accessing default members - ❌ NOT ALLOWED (different package)
        System.out.println("\n❌ DEFAULT (PACKAGE-PRIVATE) ACCESS:");
        System.out.println("   Cannot access default members from different package!");
        // System.out.println(baseObj.varDefault);      // Compilation error
        // baseObj.methodDefault();                     // Compilation error

        // Accessing private members - ❌ NOT ALLOWED
        System.out.println("\n❌ PRIVATE ACCESS:");
        System.out.println("   Cannot access private members from any external class!");
        // System.out.println(baseObj.varPrivate);      // Compilation error
        // baseObj.methodPrivate();                     // Compilation error

        // Only public method can be used to interact with private data
        baseObj.demonstratePrivateAccess();

        // Modifying only accessible (public) variables
        System.out.println("\n🔧 MODIFYING ACCESSIBLE VARIABLES:");
        baseObj.varPublic = 2000;
        System.out.println("Modified public variable to: " + baseObj.varPublic);
        baseObj.methodPublic();

        // Summary
        System.out.println("\n📋 ACCESS SUMMARY FROM DIFFERENT PACKAGE:");
        System.out.println("   ✅ Public: Accessible");
        System.out.println("   ❌ Protected: Not accessible (no inheritance)");
        System.out.println("   ❌ Default: Not accessible");
        System.out.println("   ❌ Private: Not accessible");
    }
}