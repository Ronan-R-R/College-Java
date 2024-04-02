import java.util.Scanner;
import java.util.Locale;

public class Admission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH); // Set scanner to expect dot as decimal separator

        System.out.print("Input grade average: ");
        double gradeAve = scanner.nextDouble();

        System.out.print("Enter your admission test's score (0 - 100): ");
        double score = scanner.nextDouble();

        if (gradeAve >= 3.0 && score >= 60) {
            System.out.println("Accept");
        } else if (gradeAve < 3.0 && score >= 80) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }

        scanner.close();
    }
}