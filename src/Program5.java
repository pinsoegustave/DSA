
//************************************************************
//                     Pinsoe Gustave
//                       Program #5
//                     Due 10/20/2026
// This program calculates the occurrences of a character ch in
//       any given string, counts and returns the total
//          number of occurrences and remove those
//                  occurrences.
//************************************************************
import java.util.Scanner;


public class Program5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string;
        char letter;

        System.out.println("Enter any string: ");
        string = s.nextLine();
        System.out.println("Enter any letter to search: ");
        letter = s.nextLine().charAt(0);

        System.out.println(checks(string, letter));
        System.out.println(counts(string, letter));
        System.out.println(remove(string, letter));

    }
    // Check the occurrences in the string
    public static boolean checks(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }

        if (str.charAt(0) == ch) {
            return true;
        }

        return checks(str.substring(1), ch);
    }
    // Count the occurrences in the string
    public static int counts(String str, char ch) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == ch) {
            return 1 + counts(str.substring(1), ch);
        }

        return counts(str.substring(1), ch);
    }
    // Remove the occurrences in the string
    public static String remove(String str, char ch) {
        if (str.length() == 0) {
            return "";
        }
        if (str.charAt(0) == ch) {
            return remove(str.substring(1), ch);
        }

        return str.charAt(0) + remove(str.substring(1), ch);
    }
}