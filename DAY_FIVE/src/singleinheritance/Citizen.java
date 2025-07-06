package singleinheritance;

public class Citizen {

    // Protected fields - accessible to child classes
    protected String name;
    protected String adharNo;
    protected String address;
    protected long phone;

    // Default constructor
    public Citizen() {
        System.out.println("🏛️ Citizen default constructor called");
    }

    // Parameterized constructor
    public Citizen(String name, String adharNo, String address, long phone) {
        this.name = name;
        this.adharNo = adharNo;
        this.address = address;
        this.phone = phone;
        System.out.println("🏛️ Citizen parameterized constructor called");
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(String adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    // Common method for all citizens
    public void displayCitizenInfo() {
        System.out.println("👤 Citizen Information:");
        System.out.println("   Name: " + name);
        System.out.println("   Adhar: " + adharNo);
        System.out.println("   Address: " + address);
        System.out.println("   Phone: " + phone);
    }

    // Method that can be overridden
    public void showRights() {
        System.out.println("🗳️ Basic citizen rights: Vote, Free Speech, etc.");
    }

    @Override
    public String toString() {
        return "Citizen [name=" + name + ", adharNo=" + adharNo +
                ", address=" + address + ", phone=" + phone + "]";
    }
}
