package multilevelinheritance;

public class City extends State{
    private String cityName;
    private double area;
    private long population;

    public City() {
        super();
        System.out.println("🏙️ City constructor called");
    }

    public City(String countryName, String capital, String stateName,
                String language, String cityName, double area, long population) {
        super(countryName, capital, stateName, language);
        this.cityName = cityName;
        this.area = area;
        this.population = population;
        System.out.println("🏙️ City parameterized constructor called");
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void displayCityInfo() {
        displayStateInfo(); // Inherited method
        System.out.println("🏙️ City: " + cityName + ", Area: " + area +
                " km², Population: " + population);
    }

    @Override
    public String toString() {
        return "City [cityName=" + cityName + ", area=" + area +
                ", population=" + population + ", getStateName()=" + getStateName() +
                ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName() +
                ", getCapital()=" + getCapital() + "]";
    }
}
