package multilevelinheritance;

public class State extends Country {
    protected String stateName;
    protected String language;

    public State() {
        super();
        System.out.println("🏛️ State constructor called");
    }

    public State(String countryName, String capital, String stateName, String language) {
        super(countryName, capital);
        this.stateName = stateName;
        this.language = language;
        System.out.println("🏛️ State parameterized constructor called");
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void displayStateInfo() {
        displayCountryInfo(); // Inherited method
        System.out.println("🏛️ State: " + stateName + ", Language: " + language);
    }
}
