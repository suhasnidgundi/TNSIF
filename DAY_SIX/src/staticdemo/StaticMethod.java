package staticdemo;

public class StaticMethod {

    private int instanceField = 100;
    private static int staticField = 200;

    // Static method
    public static void staticMethod() {
        System.out.println("⚡ This is a static method");
        System.out.println("   Can access static field: " + staticField);
        // System.out.println("   Cannot access instance field: " + instanceField); // Error!
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("🔧 This is an instance method");
        System.out.println("   Can access instance field: " + instanceField);
        System.out.println("   Can access static field: " + staticField);
    }

    public static void demonstrate() {
        System.out.println("🔍 Static vs Instance Methods:\n");

        // Calling static method without creating object
        System.out.println("1. Calling static method without object:");
        StaticMethod.staticMethod(); // or just staticMethod();

        System.out.println("\n2. Calling instance method requires object:");
        StaticMethod demo = new StaticMethod();
        demo.instanceMethod();

        System.out.println("\n📋 Static Method Rules:");
        System.out.println("✅ Can be called without creating object");
        System.out.println("✅ Can only access static variables directly");
        System.out.println("❌ Cannot access instance variables directly");
        System.out.println("❌ Cannot use 'this' or 'super' keywords");

        // Utility method example
        System.out.println("\n🛠️ Utility Methods Example:");
        System.out.println("Square of 5: " + MathUtils.square(5));
        System.out.println("Cube of 3: " + MathUtils.cube(3));
    }
}

class MathUtils {

    // Utility methods are typically static
    public static int square(int num) {
        return num * num;
    }

    public static int cube(int num) {
        return num * num * num;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
