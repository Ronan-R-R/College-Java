import java.util.Scanner;

public class Balance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get account balances
        System.out.print("Enter the savings account balance: ");
        double savingsBalance = scanner.nextDouble();
        System.out.print("Enter the checking account balance: ");
        double checkingBalance = scanner.nextDouble();

        // Set the minimum balance limits
        double savingsLimit = 1000.0;
        double checkingLimit = 500.0;

        // Check if both accounts are dangerously low
        if (savingsBalance < savingsLimit && checkingBalance < checkingLimit) {
            System.out.println("Both accounts are dangerously low. Take action!");
        }

        // Check individual account balances
        if (savingsBalance < savingsLimit) {
            System.out.println("Savings account balance is below the minimum limit.");
        }
        if (checkingBalance < checkingLimit) {
            System.out.println("Checking account balance is below the minimum limit.");
        }

        scanner.close();
    }
}