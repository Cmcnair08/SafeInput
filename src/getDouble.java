import java.util.Scanner;

public class getDouble {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        double value = getDouble(pipe, "Please enter a double value: ");
        System.out.println("You entered: " + value);
        pipe.close();
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0.0;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double value.");
                pipe.next();
            }
            pipe.nextLine();
        }
        return result;
    }
}
