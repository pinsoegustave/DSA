//************************************************************
//                     Pinsoe Gustave
//                       Program #6
//                     Due 11/03/2026
// This program translates morse code into normal English
//       language using Binary Search Tree. This is the
//         driver file to run the whole program.
//************************************************************

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class MorseDriver {
    public static void main(String[] args) {
        MorseCode mc = new MorseCode();
        Scanner input = null;
        PrintStream output = null;

        try {
            input = new Scanner(new FileInputStream("Morse.txt"));
        } catch (FileNotFoundException f) {
            System.out.println("Error opening (Morse.txt) file.");
            System.exit(0);
        }

//       this block creates a new file(English.txt) to store the decoded words
        try {
            output = new PrintStream(new FileOutputStream("English.txt"));
        } catch (FileNotFoundException f) {
            System.out.println("Error creating file.");
            System.exit(0);
        }

//        loop to receive text from file and decode
        while (input.hasNextLine()) {
            String text = input.nextLine().trim();
            if (text.isEmpty()) {
                output.println();
                continue;
            }

            // split the string and stores each char in any array
            String[] codes = text.split(" ");

            for (int i = 0; i < codes.length; i++) {
                String code = codes[i];

                Character dec = mc.decodeText(code);

                if (dec != null) {
                    output.print(dec);
                }
            }
            output.println();
        }
        input.close();
        output.close();
        System.out.println("Decryption successful!!!!");

    }

}
