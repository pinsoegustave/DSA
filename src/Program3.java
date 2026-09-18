// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #3 due 09/17/2026
//     This program converts a decimal number into a numerical system
//          whose base is from 2 to 36. It uses Stack to store
//               the remainders.
// *******************************************************************

import java.util.Scanner;
import java.util.Stack;

public class Program3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int num = input.nextInt();
        System.out.println("Enter the base to convert to: ");
        int base = input.nextInt();

        if (base < 2) {
            System.out.println("Sorry! the base has to be between 2 - 36");
            input.close();
            return;
        }

        if (num > 0) {
            while (num > 0) {

                int mod = num % base;
                num = num / base;
                stack.push(mod);
            }

            while (!stack.isEmpty()) {
                int firstEl = stack.pop();
                if (firstEl < 10) {
                    System.out.print(firstEl);
                } else {
                    if (firstEl == 10) System.out.print("A");
                    else if (firstEl == 11) System.out.print("B");
                    else if (firstEl == 12) System.out.print("C");
                    else if (firstEl == 13) System.out.print("D");
                    else if (firstEl == 14) System.out.print("E");
                    else if (firstEl == 15) System.out.print("F");
                    else if (firstEl == 16) System.out.print("G");
                    else if (firstEl == 17) System.out.print("H");
                    else if (firstEl == 18) System.out.print("I");
                    else if (firstEl == 19) System.out.print("J");
                    else if (firstEl == 20) System.out.print("K");
                    else if (firstEl == 21) System.out.print("L");
                    else if (firstEl == 22) System.out.print("M");
                    else if (firstEl == 23) System.out.print("N");
                    else if (firstEl == 24) System.out.print("O");
                    else if (firstEl == 25) System.out.print("P");
                    else if (firstEl == 26) System.out.print("Q");
                    else if (firstEl == 27) System.out.print("R");
                    else if (firstEl == 28) System.out.print("S");
                    else if (firstEl == 29) System.out.print("T");
                    else if (firstEl == 30) System.out.print("U");
                    else if (firstEl == 31) System.out.print("V");
                    else if (firstEl == 32) System.out.print("W");
                    else if (firstEl == 33) System.out.print("X");
                    else if (firstEl == 34) System.out.print("Y");
                    else if (firstEl == 35) System.out.print("Z");
                }
            }
        } else if (num == 0) {
            System.out.println(0);
        }
        else {
            System.out.println("Cannot convert negative numbers for now");
        }
    }
}


