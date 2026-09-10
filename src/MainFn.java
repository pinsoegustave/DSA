import java.util.Scanner;

public class MainFn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank(10);

        System.out.println("Enter your name please: ");
        String name = input.nextLine();

        Account account = bank.find(name);
        if (account == null) {
            account = new Account(name, )
        }

        double totalDeposits = 0.00;
        int choice = 0;

        while (choice != 4) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show my balance");
            System.out.println("4. Exit");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Enter the amount: ");
                double amount = input.nextDouble();
                account.deposit(amount);
                totalDeposits = totalDeposits + amount;
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
