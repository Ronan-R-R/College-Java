import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Prompt the user for an option
        System.out.println("Choose an option:");
        System.out.println("1. Add the two integers");
        System.out.println("2. Subtract the second integer from the first");
        System.out.println("3. Multiply the integers");
        System.out.println("4. Divide the first integer by the second");

        int option = scanner.nextInt();

        // Perform arithmetic based on the chosen option
        switch (option) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid option.");
        }

        scanner.close();
    }
}
