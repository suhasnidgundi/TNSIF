package singleinheritance;

public class Student extends Citizen {

    // Additional fields specific to Student
    private int rollNo;
    private String collegeName;

    // Default constructor
    public Student() {
        super(); // Calls parent constructor
        System.out.println("🎓 Student default constructor called");
    }

    // Parameterized constructor
    public Student(String name, String adharNo, String address, long phone,
                   int rollNo, String collegeName) {
        super(name, adharNo, address, phone); // Call parent constructor
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        System.out.println("🎓 Student parameterized constructor called");
    }

    // Getter and Setter for new fields
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Student-specific methods
    public void study() {
        System.out.println("📚 " + name + " is studying at " + collegeName);
    }

    public void attendLecture(String subject) {
        System.out.println("🏫 " + name + " is attending " + subject + " lecture");
    }

    // Overriding parent method
    @Override
    public void showRights() {
        super.showRights(); // Call parent method
        System.out.println("🎓 Additional student rights: Education, Library access, etc.");
    }

    // Enhanced display method
    public void displayStudentInfo() {
        displayCitizenInfo(); // Inherited method
        System.out.println("   Roll No: " + rollNo);
        System.out.println("   College: " + collegeName);
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName +
                ", getName()=" + getName() + ", getAdharNo()=" + getAdharNo() +
                ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + "]";
    }
}