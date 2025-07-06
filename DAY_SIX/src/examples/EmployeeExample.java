package examples;

public class EmployeeExample {

    public static void demonstrate() {
        System.out.println("🔍 Employee with Static Company Name:\n");

        // Creating multiple employees
        Employee emp1 = new Employee("Suhas Nidgundi", 1001);
        Employee emp2 = new Employee("Rahul Sharma", 1002);
        Employee emp3 = new Employee("Priya Patel", 1003);

        System.out.println("📋 Employee Details:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println("\n🔄 Changing Company Name:");
        System.out.println("Before: " + Employee.getCompanyName());
        Employee.setCompanyName("TNS India Foundation");
        System.out.println("After: " + Employee.getCompanyName());

        System.out.println("\n📊 All employees now show new company:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}

/**
 * Employee class with static company name
 */
class Employee {

    // Instance variables
    private String name;
    private int id;

    // Static variable - shared by all employees
    private static String companyName = "TNSIF";

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Static methods for company name
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", Company=" + companyName + "]";
    }}
