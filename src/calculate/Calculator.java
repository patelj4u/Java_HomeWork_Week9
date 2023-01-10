package calculate;

public class Calculator {

    // Instance methods for performing different calculations
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }

    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + result);
    }

    public void division(int a, int b) {
        int result = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + result);
    }

    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + result);
    }

    // Method for performing the calculation based on the symbol provided
    public void calculateResult(int a, int b, char symbol) {
        switch(symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }


}
