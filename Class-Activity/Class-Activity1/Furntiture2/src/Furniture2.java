import java.util.Scanner;

public class Furniture2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the number of table:");
        System.out.println("1. Pine\n2. Oak\n3. Mahogany");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you have the member card? 1. Yes 2. No");
        System.out.println("Choose the number:");
        boolean isMember = Integer.parseInt(scanner.nextLine()) == 1;

        double sum = 0;

        switch (number) {
            case 1:
                sum = 100;
                break;
            case 2:
                sum = 225;
                break;
            case 3:
                sum = 310;
                break;
            default:
                System.out.println("The wrong number. Please enter again.");
                number = Integer.parseInt(scanner.nextLine());
        }

        if (sum != 0) {
            System.out.println("Choose the size of the table:");
            System.out.println("1. Large (+ $35)");
            System.out.println("2. Small");
            int size = Integer.parseInt(scanner.nextLine());

            if (size == 1) {
                sum += 35;
            } else if (size != 2) {
                System.out.println("Invalid size. Please enter 1 or 2.");
            }

            if (isMember) {
                sum -= sum * 0.06;
            }
            System.out.println("Total price (excluding government tax): $" + (sum + 5.60));
        } else {
            System.out.println("The table is not chosen.");
        }
    }
}
