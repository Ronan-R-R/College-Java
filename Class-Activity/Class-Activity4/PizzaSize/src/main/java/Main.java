import java.util.Scanner;

public class Main {
    // Define PizzaSize enum
    enum PizzaSize {
        SMALL(8),
        MEDIUM(10),
        LARGE(12);

        private final int basePrice;

        PizzaSize(int basePrice) {
            this.basePrice = basePrice;
        }

        public int getBasePrice() {
            return basePrice;
        }
    }

    // Calculate pizza price based on size
    public static int calculatePizzaPrice(PizzaSize size) {
        int basePrice = size.getBasePrice();
        // You can add additional logic for toppings, crust, etc. here
        return basePrice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for pizza size
        System.out.println("Enter the size of the pizza (S/M/L):");
        String userInput = scanner.nextLine().toUpperCase();

        // Parse user input and calculate price
        PizzaSize size;
        switch (userInput) {
            case "S":
                size = PizzaSize.SMALL;
                break;
            case "M":
                size = PizzaSize.MEDIUM;
                break;
            case "L":
                size = PizzaSize.LARGE;
                break;
            default:
                System.out.println("Invalid input. Please enter S, M, or L.");
                return;
        }

        // Calculate and display the price
        int price = calculatePizzaPrice(size);
        System.out.println("Price of " + size.name() + " pizza: $" + price);

        scanner.close();
    }
}
