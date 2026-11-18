public class CRHashingWord implements Comparable<CRHashingWord> {

    String word;
    String lines;

    public CRHashingWord(String argWord, int argLine) {
        word = argWord;
        lines = argLine + " ";
    }

    public void addLine(int argLine) {
        lines = lines + argLine + " ";
    }

    public int compareTo(CRHashingWord nextWord) {
        return word.compareTo(nextWord.word);
    }

    public String toString() {
        return word + ": "+ lines;
    }
}
