package finaldemo;

public class FinalMethodDemo {

    public static void demonstrate() {
        System.out.println("🔍 Final Methods Demo:\n");

        // Creating parent and child objects
        ParentClass parent = new ParentClass();
        parent.normalMethod();
        parent.finalMethod();

        System.out.println();

        ChildClass child = new ChildClass();
        child.normalMethod();    // Overridden method
        child.finalMethod();     // Inherited final method (cannot be overridden)
    }
}

/**
 * Parent class with final method
 */
class ParentClass {

    // Normal method - can be overridden
    public void normalMethod() {
        System.out.println("🔧 Parent's normal method - can be overridden");
    }

    // Final method - cannot be overridden
    public final void finalMethod() {
        System.out.println("🛡️ Parent's final method - cannot be overridden");
    }
}

/**
 * Child class extending parent
 */
class ChildClass extends ParentClass {

    // Overriding normal method
    @Override
    public void normalMethod() {
        System.out.println("🔄 Child's overridden normal method");
    }

    // Cannot override the final method - would cause compilation error
}