package hierarchicalinheritance;

public class Person {
    protected String name;
    protected String city;
    protected int age;

    public Person() {
        System.out.println("👤 Person constructor called");
    }

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        System.out.println("👤 Person parameterized constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("👤 Person: " + name + ", City: " + city + ", Age: " + age);
    }
}