package hierarchicalinheritance;

public class Employee extends Person{
    private int empId;
    private double salary;
    private String department;

    public Employee() {
        super();
        System.out.println("💼 Employee constructor called");
    }

    public Employee(String name, String city, int age, int empId, double salary, String department) {
        super(name, city, age);
        this.empId = empId;
        this.salary = salary;
        this.department = department;
        System.out.println("💼 Employee parameterized constructor called");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void work() {
        System.out.println("💼 " + name + " is working in " + department + " department");
    }

    public void displayEmployeeInfo() {
        displayPersonInfo();
        System.out.println("   Employee ID: " + empId);
        System.out.println("   Salary: ₹" + salary);
        System.out.println("   Department: " + department);
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", salary=" + salary + ", department=" + department +
                ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
    }
}
