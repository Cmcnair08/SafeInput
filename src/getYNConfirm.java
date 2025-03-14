import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean confirmation = getYNConfirm(console, "Do you want to proceed? (Y/N): ");
        System.out.println("User confirmation: " + confirmation);
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = pipe.nextLine().trim().toLowerCase();
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
    }
}
