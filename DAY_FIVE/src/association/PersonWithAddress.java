package association;

public class PersonWithAddress {
    private String name;
    private int age;
    private Address address; // HAS-A relationship

    public PersonWithAddress() {
        System.out.println("👤 PersonWithAddress default constructor called");
    }

    public PersonWithAddress(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("👤 PersonWithAddress constructor called");
    }

    public PersonWithAddress(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("👤 PersonWithAddress with address constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayPersonWithAddress() {
        System.out.println("👤 Person: " + name + ", Age: " + age);
        if (address != null) {
            address.displayAddress();
        } else {
            System.out.println("🏠 No address information available");
        }
    }

    @Override
    public String toString() {
        return "PersonWithAddress [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
