import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite integer: ");
        int favoriteInt = getInt(scanner);

        System.out.print("Enter your favorite double: ");
        double favoriteDouble = getDouble(scanner);

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);

        scanner.close();
    }

    public static int getInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.print("Invalid input. Please enter an integer: ");
                scanner.next(); // clear the invalid input
            }
        }
    }

    public static double getDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a double: ");
                scanner.next(); // clear the invalid input
            }
        }
    }
}
