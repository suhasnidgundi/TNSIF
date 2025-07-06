package finaldemo;

public class FinalVariableDemo {

    // Final instance variable - must be initialized
    private final int finalInstance = 100;

    // Final static variable - must be initialized
    private static final String COMPANY_NAME = "TNSIF";

    // Blank final variable - must be initialized in constructor
    private final int blankFinal;

    // Static blank final - must be initialized in static block
    private static final int STATIC_BLANK_FINAL;

    // Static block to initialize static blank final
    static {
        STATIC_BLANK_FINAL = 500;
        System.out.println("🏗️ Static block: STATIC_BLANK_FINAL = " + STATIC_BLANK_FINAL);
    }

    // Constructor to initialize blank final
    public FinalVariableDemo(int value) {
        this.blankFinal = value;
        System.out.println("🔨 Constructor: blankFinal = " + blankFinal);
    }

    public void displayValues() {
        System.out.println("📊 Final Variables:");
        System.out.println("   finalInstance: " + finalInstance);
        System.out.println("   COMPANY_NAME: " + COMPANY_NAME);
        System.out.println("   blankFinal: " + blankFinal);
        System.out.println("   STATIC_BLANK_FINAL: " + STATIC_BLANK_FINAL);
    }

    public void attemptToModify() {
        System.out.println("\n❌ Attempting to modify final variables:");
        // finalInstance = 200;        // Compilation error!
        // COMPANY_NAME = "NewName";   // Compilation error!
        // blankFinal = 300;           // Compilation error!
        System.out.println("   All attempts would result in compilation errors!");
    }

    public static void demonstrate() {
        System.out.println("🔍 Final Variables Demo:\n");

        FinalVariableDemo demo1 = new FinalVariableDemo(250);
        demo1.displayValues();
        demo1.attemptToModify();

        System.out.println("\nCreating another object:");
        FinalVariableDemo demo2 = new FinalVariableDemo(350);
        demo2.displayValues();

        // Constant example
        System.out.println("\n💎 Common Constants Examples:");
        System.out.println("   Math.PI = " + Math.PI);
        System.out.println("   Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("   String class methods use final internally");
    }
}
