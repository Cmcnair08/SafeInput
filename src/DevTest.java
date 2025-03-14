import java.util.Scanner;
public class SafeInput {

    public static String getNonZeroLenString (String pipe, String prompt) {
        String retString = "";
    do {
        System.out.print("\n" + prompt + ": ");
        retString = pipe.lines().toString();
    }while (retString.length()==0);

        return retString;


    }
    }

