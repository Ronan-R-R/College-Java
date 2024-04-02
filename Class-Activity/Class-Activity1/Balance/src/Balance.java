import java.util.Scanner;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for checking account balance
        System.out.print("Enter checking account balance: $");
        double checkingBalance = scanner.nextDouble();

        // Prompt user for savings account balance
        System.out.print("Enter savings account balance: $");
        double savingsBalance = scanner.nextDouble();

        // Check and display messages
        if (checkingBalance < 10) {
            System.out.println("Checking account balance is low.");
        }
        if (savingsBalance < 100) {
            System.out.println("Savings account balance is low.");
        }

        // Close the scanner
        scanner.close();
    }
}