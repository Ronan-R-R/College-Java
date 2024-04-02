import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Providing options for different operations
            System.out.println("Select operation: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt(); // Prompting user for choice

            // Handles Calculations
            switch (choice) {
                case 1:
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage()); // Handling division by zero
                    }
                    break;
                default:
                    System.out.println("Invalid choice"); // Handling invalid operation choice
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values"); // Handling invalid input format
        } finally {
            scanner.close(); // Closing scanner
        }
    }
}