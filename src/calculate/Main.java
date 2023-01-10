package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        char choice;
        do {
            // Ask user to enter first number
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            // Ask user to enter second number
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            // Ask user to enter a symbol
            System.out.print("Please enter one of the symbols +, -, *, /: ");
            char symbol = scanner.next().charAt(0);

            // Perform the calculation based on the symbol provided
            calculator.calculateResult(a, b, symbol);

            // Ask user if they want to do more calculations
            System.out.print("Would you like to do more calculations? Please enter Y or N: ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Close the scanner
        scanner.close();
    }
}
