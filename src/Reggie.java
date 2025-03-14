import java.util.Scanner;
import java.util.regex.Pattern;

public class Reggie {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        testSSN();
        testMNumber();
        testMenuChoice();
    }

    private static void testSSN() {
            System.out.println("Enter a Social Security Number (SSN) in the format XXX-XX-XXXX:");

        String ssn = getRegExString("^(\\d{3}-\\d{2}-\\d{4})$");

            System.out.println("You entered a valid SSN: " + ssn);

                System.out.println("Testing valid SSN: 123-45-6789");

                System.out.println(getRegExString("^(\\d{3}-\\d{2}-\\d{4})$", "123-45-6789"));

         System.out.println("Testing invalid SSN: 123-456-789");

        System.out.println(getRegExString("^(\\d{3}-\\d{2}-\\d{4})$", "123-456-789"));
    }

    private static void testMNumber() {
        System.out.println("Enter a UC Student M number in the format MXXXXX:");
                String mNumber = getRegExString("^(M|m)\\d{5}$");
        System.out.println("You entered a valid M number: " + mNumber);


            System.out.println("Testing valid M number: M12345");
         System.out.println(getRegExString("^(M|m)\\d{5}$", "M12345"));

        System.out.println("Testing invalid M number: 12345");
        System.out.println(getRegExString("^(M|m)\\d{5}$", "12345"));
    }

    private static void testMenuChoice() {
        System.out.println("Enter a menu choice (O, S, V, Q):");
         String menuChoice = getRegExString("^[OoSsVvQq]$");
            System.out.println("You entered a valid menu choice: " + menuChoice);


        System.out.println("Testing valid menu choice: O");
         System.out.println(getRegExString("^[OoSsVvQq]$", "O"));

            System.out.println("Testing invalid menu choice: A");
        System.out.println(getRegExString("^[OoSsVvQq]$", "A"));
    }

                private static String getRegExString(String pattern) {
        String input = scanner.nextLine();
             if (Pattern.matches(pattern, input)) {
            return input;
        } else {
            System.out.println("Invalid input. Please try again.");
            return getRegExString(pattern);
        }
    }

                 private static String getRegExString(String pattern, String testInput) {
        if (Pattern.matches(pattern, testInput)) {
                 return testInput + " is valid.";
        } else {
            return testInput + " is invalid.";
        }
    }
}
