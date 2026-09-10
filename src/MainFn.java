// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #2 due 09/10/2026
//     This is the main program file that helps to run the whole bank system.
//          Its function is to run the whole system so that the users can
//               access their bank accounts and information.
// *******************************************************************

import java.util.Scanner;

public class MainFn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank(10);

        System.out.println("Enter your name please: ");
        String name = input.nextLine();

//        condition to check if there is similar account
        Account account = bank.find(name);
        if (account == null) {
            account = new Account(name, 100.00);
            bank.addAccount(account);
        }

        int choice = 0;
//        main while loop
        while (choice != 4) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show my balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice please: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter the amount: ");
                double amount = input.nextDouble();
                account.deposit(amount);
            }
            else if (choice == 2) {
                System.out.println("Enter the amount: ");
                double amount = input.nextDouble();
                if (!account.withdraw(amount)){
                    System.out.println("Not enough money for the withdrawal.");
                }
            }
            else if (choice == 3) {
                account.showBalance();
            } else if (choice == 4) {
                bank.printTotal();
            }
        }
        input.close();
    }
}
