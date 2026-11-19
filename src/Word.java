import java.util.LinkedList;

public class Word implements Comparable<Word> {

    String word;
    private LinkedList<Integer> lines;

    public Word(String argWord, int argLine) {
        word = argWord;
        lines = new LinkedList<>();
        lines.add(argLine);
//        lines = argLine + " ";
    }

    public void addLine(int argLine) {
//        lines = lines + argLine + " ";
//        if (lines.getLast() != argLine) {
            lines.add(argLine);
//        }
    }

    public int compareTo(Word nextWord) {
        return word.compareTo(nextWord.word);
    }

    public String toString() {
        return word + ": "+ lines;
    }
}
