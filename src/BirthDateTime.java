import java.util.Scanner;
import java.util.Random;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = getRangedInt(scanner, "Enter birth year (1950-2015): ", 1950, 2015);
        int month = getRangedInt(scanner, "Enter birth month (1-12): ", 1, 12);
        int day = getDayOfMonth(scanner, month);
        int hour = getRangedInt(scanner, "Enter birth hour (1-24): ", 1, 24);
        int minute = getRangedInt(scanner, "Enter birth minute (1-59): ", 1, 59);

        System.out.printf("Birth Date and Time: %d-%02d-%02d %02d:%02d%n", year, month, day, hour, minute);
    }

    private static int getRangedInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        do {
            System.out.print(prompt);
            value = scanner.nextInt();
        } while (value < min || value > max);
        return value;
    }

    private static int getDayOfMonth(Scanner scanner, int month) {
        int day;
        int maxDays;
        switch (month) {
            case 2:
                maxDays = 29; // Considering leap years
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }
        day = getRangedInt(scanner, "Enter birth day (1-" + maxDays + "): ", 1, maxDays);
        return day;
    }
}

