package multilevelinheritance;

public class MultilevelInheritance {
    public static void demonstrate() {
        System.out.println("📈 Creating City object (3-level inheritance):\n");

        City city = new City("India", "New Delhi", "Maharashtra", "Marathi",
                "Pune", 331.26, 3124458);

        System.out.println("\n📋 Complete City Information:");
        city.displayCityInfo();

        System.out.println("\n🔍 Inheritance Chain Demonstration:");
        System.out.println("Country → State → City");
        System.out.println("City has access to all methods from:");
        System.out.println("✅ Country class methods");
        System.out.println("✅ State class methods");
        System.out.println("✅ Its own methods");

        System.out.println("\n📊 Object Structure:");
        System.out.println("City object contains:");
        System.out.println("├── Country fields: countryName, capital");
        System.out.println("├── State fields: stateName, language");
        System.out.println("└── City fields: cityName, area, population");
    }
}
