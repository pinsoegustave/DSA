//************************************************************
//                     Pinsoe Gustave
//                       Program #7
//                     Due 11/19/2026
//  This file creates are a hash table as an array to store
//          the line numbers where the word occurs.
//************************************************************

import java.util.LinkedList;

public class Word implements Comparable<Word> {

    String word;
    private LinkedList<Integer> lines;

    public Word(String argWord, int argLine) {
        word = argWord;
        lines = new LinkedList<>();
        lines.add(argLine);
    }

    public void addLine(int argLine) {
            lines.add(argLine);
    }

    public int compareTo(Word nextWord) {
        return word.compareTo(nextWord.word);
    }

    public String toString() {
        return word + ": "+ lines;
    }
}
