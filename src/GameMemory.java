// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #1 due 09/1/2026
//     This file contains the memory of the game, board methods, player
//          methods, and the core functions of the game.
// *******************************************************************

import java.util.Random;
import java.util.Scanner;

public class GameMemory {

    private char[][] board;
    private int[][] cards;
    private boolean[][] faceUp;

    private int matchesFound;

    private Scanner scanner;
    private Random random;

    public GameMemory() {

        scanner = new Scanner(System.in);
        random = new Random();

        board = new char[4][4];
        cards = new int[4][4];
        faceUp = new boolean[4][4];

        matchesFound = 0;
    }

    // Method to set up the game
    private void setupGame() {

        // Set the board face down
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                board[i][j] = '*';
                faceUp[i][j] = false;
            }
        }

        // Creating the card pairs
        int[] numbers = new int[16];

        for (int i = 0; i < 8; i++) {

            numbers[i * 2] = i + 1;
            numbers[i * 2 + 1] = i + 1;
        }

        // Generate the cards
        for (int i = 0; i < 16; i++) {

            int randomPosition = random.nextInt(16);

            int temp = numbers[i];
            numbers[i] = numbers[randomPosition];
            numbers[randomPosition] = temp;
        }

        // Putting the cards on the board
        int position = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                cards[i][j] = numbers[position];
                position++;
            }
        }
    }

    // Method to play the game
    public void playGame() {

        setupGame();

        while (matchesFound < 8) {

            displayBoard();

            System.out.println("Match " + (matchesFound + 1) + " of 8");

            System.out.print("Enter your first card coordinates (row column): ");

            int row1 = scanner.nextInt();
            int col1 = scanner.nextInt();

            row1--;
            col1--;

            while (row1 < 0 || row1 >= 4 ||
                    col1 < 0 || col1 >= 4 ||
                    faceUp[row1][col1]) {

                System.out.println("Invalid card. Choose another one.");
                System.out.print("Enter your first card coordinates: ");

                row1 = scanner.nextInt();
                col1 = scanner.nextInt();

                row1--;
                col1--;
            }

            board[row1][col1] =
                    (char)(cards[row1][col1] + '0');

            displayBoard();

            System.out.print("Enter your second card coordinates (row column): ");

            int row2 = scanner.nextInt();
            int col2 = scanner.nextInt();

            row2--;
            col2--;

            while (row2 < 0 || row2 >= 4 ||
                    col2 < 0 || col2 >= 4 ||
                    faceUp[row2][col2] ||
                    (row1 == row2 && col1 == col2)) {

                System.out.println("Invalid card. Choose another one.");
                System.out.print("Enter your second card coordinates: ");

                row2 = scanner.nextInt();
                col2 = scanner.nextInt();

                row2--;
                col2--;
            }

            board[row2][col2] = (char)(cards[row2][col2] + '0');

            displayBoard();

            // Check if the cards match
            if (cards[row1][col1] == cards[row2][col2]) {

                System.out.println("Matched!! Face Up cards permanently.");

                faceUp[row1][col1] = true;
                faceUp[row2][col2] = true;

                matchesFound++;

            } else {

                System.out.println("No Match!! Face down cards.");

                board[row1][col1] = '*';
                board[row2][col2] = '*';

                System.out.println("Press Enter to continue...");

                scanner.nextLine();
            }
        }

        displayBoard();

        System.out.println("You won!! All pairs are matched!");
    }

    // Method to display the board
    private void displayBoard() {

        System.out.println("  1 2 3 4");

        for (int i = 0; i < 4; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < 4; j++) {

                if (faceUp[i][j]) {
                    System.out.print(cards[i][j] + " ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }

            System.out.println();
        }

        System.out.println();
    }
}