package hierarchicalinheritance;

public class StudentHierarchical extends Person{
    private int studentId;
    private String course;
    private double grade;

    public StudentHierarchical() {
        super();
        System.out.println("🎓 Student constructor called");
    }

    public StudentHierarchical(String name, String city, int age, int studentId, String course, double grade) {
        super(name, city, age);
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
        System.out.println("🎓 Student parameterized constructor called");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void study() {
        System.out.println("📚 " + name + " is studying " + course);
    }

    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("   Student ID: " + studentId);
        System.out.println("   Course: " + course);
        System.out.println("   Grade: " + grade);
    }

    @Override
    public String toString() {
        return "StudentHierarchical [studentId=" + studentId + ", course=" + course + ", grade=" + grade +
                ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
    }
}
