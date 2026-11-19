import java.util.Arrays;

public class CrossReference {
    int size = 100;
    Word[] table;

    public CrossReference() {
        table = new Word[size];
    }

    public int hash(String str) {
        int total = 0;
        for (int a = 0; a < str.length(); a++) {
            total += str.charAt(a);
        }
        return total % size;
    }

    public void insert(String str, int line) {
        int i = hash(str);
        int start = i;

        while (true) {
            if (table[i] == null) {
                table[i] = new Word(str, line);
                return;
            }

            if (table[i].word.equals(str)) {
                table[i].addLine(line);
                return;
            }
            i++;

            if (i == size) {
                i = 0;
            }

            if (i == start) {
                System.out.println("Table is full, can't insert");
                return;
            }
        }
    }

    public void sort() {
        int count = 0;
        for (int b = 0; b < size; b++) {
            if (table[b] != null) {
                count++;
            }
        }

        Word[] sortedWords = new Word[count];
        int c = 0;

        for (int d = 0; d < size; d++) {
            if (table[d] != null) {
                sortedWords[c] = table[d];
                c++;
            }
        }
        Arrays.sort(sortedWords);

        System.out.println(Arrays.toString(sortedWords));
    }
}
