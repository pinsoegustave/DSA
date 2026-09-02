import java.util.Random;
import java.util.Scanner;

public class Araf {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //for loop to create 16 cards
        int[] nums = new int[16];
        for (int i = 0; i < 8; i++)
        {
            //two copies of array from 1-8
            nums[i] = i + 1;
            nums[i + 8] = i + 1;
        }

        //using random to shuffle
        Random rand = new Random();
        for (int i = nums.length - 1; i > 0; i--)
        {
            int j = rand.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        //put numbers in 4x4 grid
        int[][] grid = new int[4][4];
        boolean[][] revealed = new boolean[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
            {
                grid[i][j] = nums[i * 4 + j];
                revealed[i][j] = false;
            }
        }

        //this is to handle pairs solved
        int pairsFound = 0;

        //loop to run until all 8 pairs are found
        while (pairsFound < 8)
        {
            //print board
            System.out.println("   1 2 3 4");
            for (int i = 0; i < 4; i++)
            {
                System.out.print((i + 1) + "  ");
                for (int j = 0; j < 4; j++)
                {
                    //show number if revealed)
                    if (revealed[i][j]) {
                        System.out.print(grid[i][j] + " ");
                    }
                    else
                    {
                        //show * if hidden
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            //ask for first guess
            System.out.println("Enter row and column of first guess (1-4 each): ");
            int row1 = scanner.nextInt() - 1;
            int col1 = scanner.nextInt() - 1;

            //check if guess is correct
            if (row1 < 0 || row1 >= 4 || col1 < 0 || col1 >= 4 || revealed[row1][col1])
            {
                System.out.println("Invalid guess, please try again!");
                continue;
            }

            //show the first guess
            System.out.println("you picked: " + grid[row1][col1]);

            //ask for second guess
            System.out.println("Enter row and column of second guess (1-4 each): ");
            int row2 = scanner.nextInt() - 1;
            int col2 = scanner.nextInt() - 1;

            //check if second guess is correct
            if (row2 < 0 || row2 >= 4 || col2 < 0 || col2 >= 4 || revealed[row2][col2])
            {
                System.out.println("Invalid guess, please try again!");
                continue;
            }

            //handling the case of picking same card
            if (row1 == row2 && col1 == col2)
            {
                System.out.println("you picked the same card twice!");
                continue;
            }

            //shoe second guess
            System.out.println("you picked: " + grid[row2][col2]);

            //check if two guesses matched
            if (grid[row1][col1] == grid[row2][col2])
            {
                System.out.println("Match Found! Lessgo!");
                revealed[row1][col1] = true;
                revealed[row2][col2] = true;
                pairsFound++;
            }
            else
            {
                System.out.println("Boo, not a match, press Enter to continue");
                scanner.nextLine(); // clear leftover newline
                scanner.nextLine(); // wait for Enter
            }
        }

        // Final board
        System.out.println("   1 2 3 4");
        for (int i = 0; i < 4; i++)
        {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < 4; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Congratulations! You win!");
    }
}

