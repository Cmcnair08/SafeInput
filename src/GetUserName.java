import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        DevTest SafeInput = null;
        firstName = DevTest.getNonZeroLenString(String.valueOf(in), "Enter your first name");
        lastName = DevTest.getNonZeroLenString(String.valueOf(in), "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
