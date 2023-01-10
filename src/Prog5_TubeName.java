
    import java.util.ArrayList;

    public class Prog5_TubeName {
        public static void main(String[] args) {
            // Create a new ArrayList of strings representing underground tube names
            ArrayList<String> tubes = new ArrayList<>();

            // Add some tube names to the list
            tubes.add("Bakerloo");
            tubes.add("Central");
            tubes.add("Circle");
            tubes.add("District");
            tubes.add("Hammersmith & City");
            tubes.add("Jubilee");
            tubes.add("Metropolitan");
            tubes.add("Northern");
            tubes.add("Piccadilly");
            tubes.add("Victoria");
            tubes.add("Waterloo & City");

            // Test to see if the list is empty
            if (tubes.isEmpty()) {
                System.out.println("The list of tubes is empty.");
            } else {
                System.out.println("The list of tubes is not empty.");
            }
        }
}
