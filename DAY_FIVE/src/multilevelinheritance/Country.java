package multilevelinheritance;

public class Country {
    protected String countryName;
    protected String capital;

    public Country() {
        System.out.println("🌍 Country constructor called");
    }

    public Country(String countryName, String capital) {
        this.countryName = countryName;
        this.capital = capital;
        System.out.println("🌍 Country parameterized constructor called");
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void displayCountryInfo() {
        System.out.println("🏴 Country: " + countryName + ", Capital: " + capital);
    }
}
