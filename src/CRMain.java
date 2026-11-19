import java.io.FileInputStream;
import java.util.Scanner;

public class CRMain {
    public static void main(String[] args) {
        CrossReference c = new CrossReference();
        String fileName = "Hash.txt";
        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream(fileName));
        }
        catch(Exception e) {
            System.out.println("file not found");
            return;
        }
        int lineNumber = 1;

        while(inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            String[] splitWords = line.split(" ");

            for(String split : splitWords) {
                if (split.length()>0) {
                    String word = split.toLowerCase();
                    c.insert(word, lineNumber);
                }
            }
            lineNumber++;
        }
        inputStream.close();
        c.sort();
    }
}
