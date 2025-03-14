public class PrettyHeader {
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int starsOnEachSide = (totalWidth - msgLength - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < starsOnEachSide; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < starsOnEachSide; i++) {
            System.out.print(" ");
        }
        System.out.println("***");


        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }
}
