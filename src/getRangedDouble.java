import java.util.Scanner;
public class getRangedDouble {

    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        double value = getRangedDouble(pipe, "Enter a value between ", 1.0, 10.0);
        System.out.println("You entered: " + value);
        pipe.close();
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double input;

        while (true) {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            input = pipe.nextDouble();
            if (input >= low && input <= high) {
                return input;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
