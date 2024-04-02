import java.util.Scanner;

public class Main {
    // Define Seasons enum
    enum Seasons {
        WINTER,
        SPRING,
        SUMMER,
        FALL
    }

    // Method to determine season based on month
    public static Seasons detectSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return Seasons.WINTER;
            case 3:
            case 4:
            case 5:
                return Seasons.SPRING;
            case 6:
            case 7:
            case 8:
                return Seasons.SUMMER;
            case 9:
            case 10:
            case 11:
                return Seasons.FALL;
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for month
        System.out.println("Enter the month (1-12):");
        int month = scanner.nextInt();

        // Detect season based on month
        Seasons season = detectSeason(month);

        // Print message indicating the season
        if (season != null) {
            System.out.println("The season for month " + month + " is " + season);
        } else {
            System.out.println("Invalid month entered.");
        }

        scanner.close();
    }
}
