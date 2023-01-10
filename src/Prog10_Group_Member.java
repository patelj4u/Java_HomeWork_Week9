public class Prog10_Group_Member {
    public static void main(String[] args) {
        // Create four arrays of strings to hold the group member names
        String[] postman = {"Jiten", "Minesh", "Maulik", "Sheetal"};
        String[] java = {"Anupama", "Krunal", "Riddhi"};
        String[] selenium = {"Urvi", "Sonia", "Kuldip", "Umangi"};
        String[] restAssured = {"Jigar", "Akshit", "Shivam", "Arpita"};

        // Iterate through each array and search for "Jiten" in each group array
        for (String name : postman) {
            if (name.equals("Jiten")) {
                System.out.println("Found Jiten in the postman group");
            }
        }
        for (String name : java) {
            if (name.equals("Jiten")) {
                System.out.println("Found Jiten in the java group");
            }
        }
        for (String name : selenium) {
            if (name.equals("Jiten")) {
                System.out.println("Found Jiten in the selenium group");
            }
        }
        for (String name : restAssured) {
            if (name.equals("Jiten")) {
                System.out.println("Found Jiten in the restAssured group");
            }
        }
    }
}

