import java.util.Random;
import java.util.Scanner;

//********************************************************************
//                  Pinsoe Gustave
//
//              Program #1 due 09/1/2026
//     This program considers a memory matching game that uses 16 cards. 2 cards drawn
//          at the same time have to match to stay faced up, if not they
//               are put back face down to be drawn again.
// *******************************************************************
public class Program1 {
    private static final int SIZE = 4;
    private static final int PAIRS = 8;
    private static char[][] board;
    private static int[][] cards;
    private static boolean[][] faceUp;
    private static int matchesFound;
    private static Scanner scanner;
    private static Random random;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        initializeGame();
        playGame();

        scanner.close();
    }

    private static void initializeGame() {
        board = new char[SIZE][SIZE];
        cards = new int[SIZE][SIZE];
        faceUp = new boolean[SIZE][SIZE];
        matchesFound = 0;

//        Initialize the board with face down cards
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '*';
                faceUp[i][j] = false;
            }
        }

//        Create pairs of cards
        int[] cardValues = new int[SIZE * SIZE];
        for (int i = 0; i < PAIRS; i++) {
            cardValues[i * 2] = i + 1;
            cardValues[i * 2 + 1] = i + 1;
        }

//        Shuffle the cards
        for (int i = cardValues.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = cardValues[i];
            cardValues[i] = cardValues[j];
            cardValues[j] = temp;
        }

//        Move shuffled cards to the grid
        int index = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cards[i][j] = cardValues[index++];
            }
        }
    }

    private static void playGame() {
        while (matchesFound < PAIRS) {

            clearScreen();
            displayBoard();

            System.out.println("Match "+ (matchesFound + 1) + " of " + PAIRS);
            System.out.println("Enter your first card coordinates(row, column): ");
            int[] first = getCoordinates();

            board[first[0]][first[1]] = (char)(cards[first[0]][first[1]] + '0');
            clearScreen();
            displayBoard();

            System.out.println("Enter your second card coordinates(row, column): ");
            int[] second = getCoordinates();

//            Turn second card faceUp
            board[second[0]][second[1]] = (char)(cards[second[0]][second[1]] + '0');
            clearScreen();
            displayBoard();

//            Check if they match
            if (cards[first[0]][first[1]] == cards[second[0]][second[1]] &&
                    !(first[0] == second[0] && first[1] == second[1])) {
                System.out.println("Matched!! Face Up cards permanently.");
                faceUp[first[0]][first[1]] = true;
                faceUp[second[0]][second[1]] = true;
                matchesFound++;
            } else {
                System.out.println("No Match!! Face down cards.");
                board[first[0]][first[1]] = '*';
                board[second[0]][second[1]] = '*';

//                Show cards again
                System.out.println("\n Press Enter to continue...");
                scanner.nextLine();
            }
        }
        clearScreen();
        displayBoard();
        System.out.println("You won!! All pairs are matched!");
    }

    private static int[] getCoordinates() {
        int row, col;
        while (true) {
            String input = scanner.nextLine().trim();
            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                try {
                    row = Integer.parseInt(parts[0]) - 1;
                    col = Integer.parseInt(parts[1]) - 1;

                    if(row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
                        if (!faceUp[row][col]) {
                            if (board[row][col] == '*') {
                                return new int[]{row, col};
                            } else {
                                System.out.println("This card is already face up. Choose another one.");
                                System.out.println("Enter new coordinates: ");
                            }
                        }
                            else {
                            System.out.println("This card is permanently face up. Choose another one.");
                            System.out.println("Enter new coordinates: ");
                        }

                    } else {
                        System.out.println("Invalid coordinates. Enter values between 1 and 4");
                        System.out.println("Enter new coordinates: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter two numbers (row column).");
                    System.out.println("Enter new coordinates: ");
                }
            } else {
                System.out.println("Invalid input. Please enter two numbers (row column).");
                System.out.println("Enter new coordinates: ");
            }
        }
    }

    private static void displayBoard() {
        System.out.println(" " + "1 2 3 4");
        for (int i = 0; i < SIZE; i++) {
            System.out.println((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                if (faceUp[i][j]) {
                    System.out.println(cards[i][j] + " ");
                } else {
                    System.out.println(board[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void clearScreen() {
//        clearing the screen
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
