import java.util.Scanner;

public class CheckOut {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double totalCost = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double itemPrice = getRangedDouble(0.50, 10.00);
            totalCost += itemPrice;
            moreItems = getYNConfirm("Do you have more items? (Y/N)");
        }

        System.out.printf("Total cost: $%.2f%n", totalCost);
    }

    public static double getRangedDouble(double min, double max) {
        double value;
        do {
            System.out.printf("Enter the price of the item (%.2f to %.2f): ", min, max);
            value = scanner.nextDouble();
        } while (value < min || value > max);
        return value;
    }

    public static boolean getYNConfirm(String prompt) {
        String response;
        do {
            System.out.print(prompt + " ");
            response = scanner.next().trim().toUpperCase();
        } while (!response.equals("Y") && !response.equals("N"));
        return response.equals("Y");
    }
}
