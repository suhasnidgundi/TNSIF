package examples;

public class CounterExample {

    private int instanceCounter;        // Non-static variable
    private static int staticCounter;   // Static variable

    // Static block
    static {
        System.out.println("🏗️ Static block executed");
        staticCounter = 1000;
    }

    // Constructor
    public CounterExample() {
        System.out.println("🔨 Constructor executed");
        staticCounter++;
        instanceCounter++;
    }

    // Static method
    public static void displayStaticCounter() {
        System.out.println("⚡ Static Counter: " + staticCounter);
        // System.out.println("Instance Counter: " + instanceCounter); // Error!
    }

    // Instance method
    public void displayCounters() {
        System.out.println("📊 Instance Counter: " + instanceCounter +
                ", Static Counter: " + staticCounter);
    }

    @Override
    public String toString() {
        return "CounterExample [Serial No: " + staticCounter +
                ", Instance: " + instanceCounter + "]";
    }

    public static void demonstrate() {
        System.out.println("🔍 Counter Example Demo:\n");

        // Call static method before creating objects
        CounterExample.displayStaticCounter();

        System.out.println("\nCreating objects:");

        CounterExample obj1 = new CounterExample();
        System.out.println(obj1);
        obj1.displayCounters();

        System.out.println();

        CounterExample obj2 = new CounterExample();
        System.out.println(obj2);
        obj2.displayCounters();

        System.out.println();

        CounterExample obj3 = new CounterExample();
        System.out.println(obj3);
        obj3.displayCounters();

        System.out.println("\n📋 Observations:");
        System.out.println("✅ Static counter increments across all objects");
        System.out.println("✅ Instance counter resets for each object");
        System.out.println("✅ Static block executes only once");
    }
}