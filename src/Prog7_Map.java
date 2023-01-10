import java.util.HashMap;
import java.util.Map;
    public class Prog7_Map {


        public static void main(String[] args) {
            // Create a new HashMap object called people that stores String keys and Integer values
            Map<String, Integer> people = new HashMap<>();

            // Add some entries to the map
            people.put("John", 25);
            people.put("Jane", 30);
            people.put("Bob", 35);
            people.put("Alice", 40);

            // Use a for-each loop to iterate through the values in the map
            for (Integer age : people.values()) {
                System.out.println(age);
            }

            System.out.println("\n");

            // Use a for-each loop to iterate through the keys in the map
            for (String name : people.keySet()) {
                System.out.println(name);
            }

            System.out.println("\n");
            // Use a for-each loop to iterate through the key-value pairs in the map
            for (Map.Entry<String, Integer> entry : people.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        }
    }

