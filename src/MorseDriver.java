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
            System.out.println("Error opening file.");
            System.exit(0);
        }

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

            String[] codes = text.split(" ");
            for (int i = 0; i < codes.length; i++) {
                String code = codes[i];

                Character dec = mc.decodeText(code);

                if (dec != null) {
                    output.print(dec);
                }
            }
//            String[] codes = text.split("\\s+");
//            for (String code : codes) {
//                Character dec = mc.decodeText(code);
//                if (dec != null) {
//                    output.print(dec);
//                }
//            }
            output.println();
        }
        input.close();
        output.close();
        System.out.println("Decryption successful!!!!");

    }

}
