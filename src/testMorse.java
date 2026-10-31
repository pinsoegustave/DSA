public class testMorse {
    public static void main(String[] args) {
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String[] code = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        String morseCode = "... -.-. .... ---- ---- .-..";
        String englishLang = "alice";

        testMorse conv = new testMorse();
        conv.englishToMorse(code, englishLang, letter);
        conv.morseToEnglish(code, morseCode);
    }

    public void englishToMorse(String[] code, String englishLang, char[] letter) {
        System.out.println("Morse code of " + englishLang + " is:");

        for (int i = 0; i < englishLang.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (englishLang.charAt(i) == letter[j]) {
                    System.out.print(code[j] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public void morseToEnglish(String[] code, String morseCode) {
        String[] array = morseCode.split(" ");
        System.out.println("Morse code " + morseCode + " to English is:");

        for (String morseLetter : array) {
            for (int i = 0; i < code.length; i++) {
                if (morseLetter.equals(code[i])) {
                    System.out.print((char) (i + 'a'));
                    break;
                }
            }
        }
        System.out.println();
    }
}
