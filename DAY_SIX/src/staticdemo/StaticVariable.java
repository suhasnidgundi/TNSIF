package staticdemo;

public class StaticVariable {

    private int instanceVariable = 0;           // Instance variable
    private static int staticVariable = 0;      // Static variable

    public StaticVariable() {
        instanceVariable++;
        staticVariable++;
        System.out.println("📊 Object created - Instance: " + instanceVariable +
                ", Static: " + staticVariable);
    }

    public void displayValues() {
        System.out.println("   Instance Variable: " + instanceVariable);
        System.out.println("   Static Variable: " + staticVariable);
    }

    public static void demonstrate() {
        System.out.println("🔍 Creating multiple objects to see static vs instance variables:\n");

        System.out.println("Creating first object:");
        StaticVariable obj1 = new StaticVariable();
        obj1.displayValues();

        System.out.println("\nCreating second object:");
        StaticVariable obj2 = new StaticVariable();
        obj2.displayValues();

        System.out.println("\nCreating third object:");
        StaticVariable obj3 = new StaticVariable();
        obj3.displayValues();

        System.out.println("\n📋 Observations:");
        System.out.println("✅ Instance variables are unique to each object");
        System.out.println("✅ Static variables are shared among all objects");
        System.out.println("✅ Static variables belong to the class, not instances");
    }
}
