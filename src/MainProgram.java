
// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #1 due 09/1/2026
//     This program considers a memory matching game that uses 16 cards
//          at the same time have to match to stay faced up, if not they
//               are put back face down to be drawn again.
// *******************************************************************

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GameMemory game = new GameMemory();

        game.playGame();
    }
}