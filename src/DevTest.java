public class DevTest {

    public static String getNonZeroLenString (String pipe, String prompt) {
        String retString = "";
    do {
        System.out.print("\n" + prompt + ": ");
        retString = pipe.lines().toString();
    }while (retString.isEmpty());

        return retString;


    }
    }

