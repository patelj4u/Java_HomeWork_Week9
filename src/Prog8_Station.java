
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    public class Prog8_Station {


        public static void main(String[] args) {
            // Create a new HashMap object called stations that stores the names of London Underground stations as keys and the lines that pass through those stations as values
            Map<String, String> stations = new HashMap<>();

            // Add stations to the map
            // First String = station name
            // Second set of strings = tube limes
            stations.put("Baker Street", "Bakerloo, Circle, Hammersmith & City, Jubilee, Metropolitan");
            stations.put("Bond Street", "Central, Jubilee");
            stations.put("Charing Cross", "Bakerloo, Northern");
            stations.put("Euston", "Northern, Victoria");
            stations.put("Green Park", "Jubilee, Piccadilly, Victoria");
            stations.put("Kings Cross St Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
            stations.put("Liverpool Street", "Circle, Hammersmith & City, Metropolitan, Northern");
            stations.put("London Bridge", "Jubilee, Northern");
            stations.put("Oxford Circus", "Bakerloo, Central, Victoria");
            stations.put("Paddington", "Bakerloo, Circle, Hammersmith & City, District, Metropolitan");
            stations.put("Piccadilly Circus", "Bakerloo, Piccadilly");
            stations.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");

            // Create a Scanner object for reading user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a station name
            System.out.print("Enter a station name: ");
            String station = scanner.nextLine();

            // Convert the user input to lowercase
            station = station.toLowerCase();

            // Check if the map contains a key that matches the user input
            boolean found = false;
            for (Map.Entry<String, String> entry : stations.entrySet()) {
                if (entry.getKey().toLowerCase().equals(station)) {
                    // If a match is found, print out the lines that pass through the station
                    System.out.println("The following lines pass through " + entry.getKey() + ": " + entry.getValue());
                    found = true;
                    break;
                }
            }
            if (!found) {
                // If no match is found, print an error message
                System.out.println("Sorry, I could not find that station.");
            }
        }
}
