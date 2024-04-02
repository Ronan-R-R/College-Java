import java.util.Scanner;

public class Lawn {
    public static void main(String[] args) {
        final int WEEKS_IN_SEASON = 20;
        final double FEE_UNDER_4000 = 25.0;
        final double FEE_4000_TO_5999 = 35.0;
        final double FEE_6000_AND_OVER = 50.0;

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length and width of the lawn
        System.out.print("Enter the length of the lawn (in feet): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the lawn (in feet): ");
        double width = scanner.nextDouble();

        // Calculate the area of the lawn
        double area = length * width;

        // Calculate the weekly fee based on the area of the lawn
        double weeklyFee;
        if (area < 4000) {
            weeklyFee = FEE_UNDER_4000;
        } else if (area < 6000) {
            weeklyFee = FEE_4000_TO_5999;
        } else {
            weeklyFee = FEE_6000_AND_OVER;
        }

        // Display the weekly mowing fee
        System.out.println("Weekly mowing fee: $" + weeklyFee);

        // Calculate the seasonal fee
        double seasonalFee = weeklyFee * WEEKS_IN_SEASON;

        // Display the seasonal fee
        System.out.println("Seasonal fee (for 20 weeks): $" + seasonalFee);

        scanner.close();
    }
}
