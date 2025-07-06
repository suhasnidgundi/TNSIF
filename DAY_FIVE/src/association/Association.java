package association;

public class Association {
    public static void demonstrate() {
        System.out.println("🤝 Association (HAS-A Relationship) Demo:\n");

        // Creating Address object
        Address address = new Address("123 MG Road", "Pune", "Maharashtra", "411001", "India");

        // Creating Person with Address - Composition
        PersonWithAddress person = new PersonWithAddress("Suhas Nidgundi", 25, address);

        System.out.println("\n📋 Person with Address Information:");
        person.displayPersonWithAddress();

        System.out.println("\n🔍 Association Types:");
        System.out.println("1. 🔗 Aggregation (HAS-A): Weak relationship");
        System.out.println("   - Objects can exist independently");
        System.out.println("   - Example: Car HAS-A Engine (Engine can exist without Car)");

        System.out.println("\n2. 🧱 Composition (PART-OF): Strong relationship");
        System.out.println("   - Objects cannot exist independently");
        System.out.println("   - Example: House HAS-A Room (Room cannot exist without House)");

        // Demonstrating object independence
        System.out.println("\n📊 Object Relationship:");
        System.out.println("PersonWithAddress object contains:");
        System.out.println("├── name: " + person.getName());
        System.out.println("├── age: " + person.getAge());
        System.out.println("└── address: Reference to Address object");

        // Changing address
        System.out.println("\n🔄 Changing address:");
        Address newAddress = new Address("Nana Nagar", "Pune", "Maharashtra", "411024", "India");
        person.setAddress(newAddress);
        person.displayPersonWithAddress();
    }
}
