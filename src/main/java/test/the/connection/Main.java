package test.the.connection;

/**
 * Created by joey on 2015.10.20..
 * This class has the main method
 */
public class Main {

    /**
     * The entry point of the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Megy");
    }

    /**
     * Prints a line only made of '-' characters to separate to next and the previous lines
     * @param count the number of '-' character to use in the separator line
     */
    private static void spearatorLine(int count) {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++)
            sb.append('-');
        System.out.println(sb);
    }

    /**
     * Prints the given messages count times
     * @param msg the message to print
     * @param count this many times
     */
    private static void print(String msg, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

}
