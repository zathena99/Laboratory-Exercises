import java.util.HashMap;
import java.util.Map;

public class SimpleMaps {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> countries = new HashMap<>();

        // Add key-value pairs to the map
        countries.put("USA", "United States of America");
        countries.put("CA", "Canada");
        countries.put("MX", "Mexico");

        // Print the map
        System.out.println(countries);

        // Access a value using a key
        String countryName = countries.get("USA");
        System.out.println(countryName);

        // Check if a key exists
        boolean hasCanada = countries.containsKey("CA");
        System.out.println("Has Canada: " + hasCanada);

        // Remove a key-value pair
        countries.remove("MX");

        // Iterate over the map
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}