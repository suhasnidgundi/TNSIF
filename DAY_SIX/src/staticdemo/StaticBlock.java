package staticdemo;

public class StaticBlock {
    private static int staticVar;
    private static String message;

    // Static block 1
    static {
        System.out.println("🏗️ Static Block 1 executed");
        staticVar = 100;
        System.out.println("   staticVar initialized to: " + staticVar);
    }

    // Static block 2
    static {
        System.out.println("🏗️ Static Block 2 executed");
        message = "Hello from Static Block!";
        System.out.println("   message initialized to: " + message);
    }

    // Constructor
    public StaticBlock() {
        System.out.println("🔨 Constructor executed");
    }

    // Instance block
    {
        System.out.println("📦 Instance block executed");
    }

    public static void displayStaticValues() {
        System.out.println("📊 Static Values:");
        System.out.println("   staticVar: " + staticVar);
        System.out.println("   message: " + message);
    }

    public static void demonstrate() {
        System.out.println("🔍 Static Block Execution Order:\n");

        System.out.println("Before creating any object:");
        displayStaticValues();

        System.out.println("\nCreating first object:");
        StaticBlock obj1 = new StaticBlock();

        System.out.println("\nCreating second object:");
        StaticBlock obj2 = new StaticBlock();

        System.out.println("\n📋 Execution Order:");
        System.out.println("1. ✅ Static blocks (when class is first loaded)");
        System.out.println("2. ✅ Instance blocks (before each constructor)");
        System.out.println("3. ✅ Constructor (for each object creation)");

        System.out.println("\n💡 Static blocks are executed only once!");
    }
}
