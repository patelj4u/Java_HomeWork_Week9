import java.util.ArrayList;
import java.util.Iterator;

public class Prog4_Array_Elements {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();

        //add some number to the list
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        //get an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();
        // Iterate through the list using the Iterator
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        // Can use for loop too
        /*
        for (int number : numbers) {
            System.out.println(number);
        }
        */
    }
    }

