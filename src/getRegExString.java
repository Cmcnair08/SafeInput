import java.util.Scanner;

public class getRegExString {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String result = getRegExString(pipe, "Please enter a valid input: ", "This is a valid input");
        System.out.println("You entered: " + result);
        pipe.close();
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = pipe.nextLine();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
