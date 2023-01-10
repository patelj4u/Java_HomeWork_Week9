

import java.util.ArrayList;

public class Prog3_Array_c {public static void main(String[] args) {
    // Create a new ArrayList of strings
    ArrayList<String> colors = new ArrayList<>();

    // Add some colors to the list
    colors.add("Red");
    colors.add("Orange");
    colors.add("Yellow");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Indigo");
    colors.add("Violet");

    // Print out the colors using a for-each loop
    for (String color : colors) {
        System.out.println(color);
    }
}
}
