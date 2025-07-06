package singleinheritance;

public class SingleInheritance {
    public static void demonstrate() {
        System.out.println("🔗 Creating Student object (inherits from Citizen):\n");

        // Creating student using parameterized constructor
        Student student = new Student("Suhas Nidgundi", "1234567890",
                "Pune, Maharashtra", 1234567890,
                13249, "DYPCOEI");

        System.out.println("\n📋 Student Details:");
        System.out.println(student);

        System.out.println("\n🔍 Demonstrating inherited and own methods:");

        // Using inherited methods
        student.displayCitizenInfo();

        // Using own methods
        student.study();
        student.attendLecture("Object Oriented Programming");

        System.out.println("\n🔄 Method Overriding Demo:");
        student.showRights();

        System.out.println("\n📊 Memory Representation:");
        System.out.println("Student object contains:");
        System.out.println("├── Citizen fields: name, adharNo, address, phone");
        System.out.println("└── Student fields: rollNo, collegeName");
    }
}
