import java.util.Scanner;

public class getRangedInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = getRangedInt(in, "Please enter an integer", 1, 10);
        System.out.println("You entered: " + result);
        in.close();
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int userInput = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                userInput = pipe.nextInt();
                if (userInput >= low && userInput <= high) {
                    validInput = true;
                } else {
                    System.out.println("Error: Input must be between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                pipe.next();
            }
            pipe.nextLine();
        }
        return userInput;
    }
}
