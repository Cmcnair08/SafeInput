import java.util.Scanner;

public class getInt {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int userInput = getInt(pipe, "Please enter an integer: ");
        System.out.println("You entered: " + userInput);
        pipe.close();
    }

    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                pipe.next(); // Clear the invalid input
            }
            pipe.nextLine(); // Clear the newline character
        }
        return result;
    }
}
