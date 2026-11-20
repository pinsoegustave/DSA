//************************************************************
//                     Pinsoe Gustave
//                       Program #7
//                     Due 11/19/2026
// This main program file that reads words line by line from the
//   input file(Hash.txt), perform all actions (hash, sort and
//     insert into the hash table) and prints the final hash table.
//************************************************************

import java.io.FileInputStream;
import java.util.Scanner;

public class CRMain {
    public static void main(String[] args) {
        CrossReference c = new CrossReference();
        String fileName = "Hash.txt";
        Scanner inputStream = null;

//        block for file reading
        try {
            inputStream = new Scanner(new FileInputStream(fileName));
        }
        catch(Exception e) {
            System.out.println("File Not Found");
            return;
        }

//        loop to go through the file and read the words
        int lineNumber = 1;
        while(inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            String[] splitWords = line.split(" ");

            for(String split : splitWords) {
                if (!split.isEmpty()) {
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
