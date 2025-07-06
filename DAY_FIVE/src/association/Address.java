package association;

public class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address() {
        System.out.println("🏠 Address default constructor called");
    }

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        System.out.println("🏠 Address parameterized constructor called");
    }

    // Getters and Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void displayAddress() {
        System.out.println("🏠 Address:");
        System.out.println("   " + street);
        System.out.println("   " + city + ", " + state + " " + postalCode);
        System.out.println("   " + country);
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", city=" + city + ", state=" + state +
                ", postalCode=" + postalCode + ", country=" + country + "]";
    }
}
