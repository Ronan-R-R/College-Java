//Michelle Lichtenstein 20230297
//Ronan Roberts 20230297
public class SimpleInterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Calculate simple interest using the given formula
        double simpleInterest = (principal * rate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        // Example usage:
        double principalAmount = 1000.0; // Replace with the actual principal amount
        double annualInterestRate = 5.0; // Replace with the actual annual interest rate
        double timeInYears = 2.5; // Replace with the actual time in years

        double interest = calculateSimpleInterest(principalAmount, annualInterestRate, timeInYears);
        System.out.println("Simple Interest: $" + interest);
    }
}

