//************************************************************
//                     Pinsoe Gustave
//                       Program #6
//                     Due 11/03/2026
// This program translates morse code into normal English
//       language using Binary Search Tree. This file
//         contains methods to decode the morse code.
//************************************************************
public class MorseCode extends BST<Character> {

    public Character[] letter = {
            'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','x','y','z'
    };

    public String[] morseCode = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    public MorseCode() {
        for (int a = 0; a < morseCode.length; a++) {
            incodeText(letter[a], morseCode[a]);
        }
    }

    public void incodeText(Character letter, String morseCode) {
        if (root == null) {
            root = new BSTNode<Character>(null);
        }

        BSTNode<Character> p = root;

        for (int b = 0; b < morseCode.length(); b++) {
            char code = morseCode.charAt(b);

            if (code == '.') {
                if (p.right == null) {
                    p.right = new BSTNode<Character>(null);
                }
                p = p.right;
            } else if (code == '-') {
                if (p.left == null) {
                    p.left = new BSTNode<Character>(null);
                }
                p = p.left;
            }
        }
        p.el = letter;
    }

    public Character decodeText(String morseCode) {
        BSTNode<Character> p = root;

        for (int c = 0; c < morseCode.length(); c++) {
            char ch = morseCode.charAt(c);

            if (ch == '.') {
                if (p.right == null) {
                    return null;
                }
                p = p.right;
            } else if (ch == '-') {
                if (p.left == null) {
                    return null;
                }
                p = p.left;
            } else {
                return null;
            }
        }
        return p.el;
    }

}