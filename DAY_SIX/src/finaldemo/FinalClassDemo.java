package finaldemo;

public class FinalClassDemo {

    public static void demonstrate() {
        System.out.println("🔍 Final Classes Demo:\n");

        // Creating object of final class
        ImmutableClass obj = new ImmutableClass("Hello World", 42);
        obj.display();

        System.out.println("\n📋 Final Class Rules:");
        System.out.println("✅ Cannot be extended (no subclasses allowed)");
        System.out.println("✅ All methods are implicitly final");
        System.out.println("✅ Used for creating immutable classes");
        System.out.println("✅ Examples: String, Integer, Double, etc.");

        System.out.println("\n🎯 Benefits of Final Classes:");
        System.out.println("• Security: Prevents malicious extensions");
        System.out.println("• Design Integrity: Maintains intended behavior");
        System.out.println("• Performance: JVM optimizations possible");
        System.out.println("• Immutability: Often used with immutable objects");

        // String is final class example
        System.out.println("\n💡 String Class Example:");
        String str = "Hello";
        System.out.println("   Original: " + str);
        str = str.concat(" World");
        System.out.println("   After concat: " + str);
        System.out.println("   (New object created, original unchanged)");
    }
}

/**
 * Final class - cannot be extended
 */
final class ImmutableClass {

    private final String message;
    private final int value;

    public ImmutableClass(String message, int value) {
        this.message = message;
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public int getValue() {
        return value;
    }

    public void display() {
        System.out.println("🏛️ ImmutableClass - Message: " + message + ", Value: " + value);
    }
}