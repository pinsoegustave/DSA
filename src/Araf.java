//import java.util.Scanner;
//
//public class Account1 {
//    private String name;
//    private double balance;
//
//    public Account1 (String argName, double argBalance) {
//        name = argName;
//        balance = argBalance;
//    }
//
//    //    Method to print the balance of the user
//    public void showBalance() {
//        System.out.printf("%s: Your balance = $%.2f%n", name, balance);
//    }
//
//    //    Getter method to help access the user's name.
//    public String getName() {
//        return name;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//
//        balance = balance + amount;
//    }
//
//    //    Method to help on withdraw function
//    public boolean withdraw(double amount) {
//        if (amount > balance) {
//            return false;
//        }
//
//        balance = balance - amount;
//        return true;
//    }
//
//    //    toString method to help print balance message
//    public String toString() {
//        return String.format("%s: Your balance = $%.2f", name, balance);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Account other)) {
//            return false;
//        }
//        return name.equals(other.name) && this.balance == other.balance;
//    }
//
//}
//
//public class Bank {
//    private Account[] accounts;
//    private int count;
//
//    public Bank(int total) {
//        accounts = new Account[total];
//        count = 0;
//    }
//
//    //    find method to check if there is an account with a particular name
//    public Account find (String name) {
//        for (int i = 0; i < count; i++) {
//            if (accounts[i].getName().equals(name)) {
//                return accounts[i];
//            }
//        }
//
//        return null;
//    }
//
//    //    Add an account to the array
//    public void addAccount(Account a) {
//        if (count < accounts.length) {
//            accounts[count] = a;
//            count++;
//        }
//        else {
//            System.out.println("Bank is full - cannot add account.");
//        }
//    }
//    //    Method to print the total deposits in a session
//    public void printTotal() {
//        double total = 0.0;
//        for (int i = 0; i < count; i++) {
//            total = total + accounts[i].getBalance();
//        }
//        System.out.printf("All deposits in the bank: $%.2f%n", total);
//    }
//
//}
//
//public class Araf {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        Bank bank = new Bank(10);
//
//        System.out.println("Enter your name please: ");
//        String name = input.nextLine();
//
////        condition to check if there is similar account
//        Account account = bank.find(name);
//        if (account == null) {
//            account = new Account(name, 100.00);
//            bank.addAccount(account);
//        }
//
//        int choice = 0;
////        main while loop
//        while (choice != 4) {
//            System.out.println("1. Deposit");
//            System.out.println("2. Withdraw");
//            System.out.println("3. Show my balance");
//            System.out.println("4. Exit");
//            System.out.println("Enter your choice please: ");
//
//            choice = input.nextInt();
//
//            if (choice == 1) {
//                System.out.println("Enter the amount: ");
//                double amount = input.nextDouble();
//                account.deposit(amount);
//            }
//            else if (choice == 2) {
//                System.out.println("Enter the amount: ");
//                double amount = input.nextDouble();
//                if (!account.withdraw(amount)){
//                    System.out.println("Not enough money for the withdrawal.");
//                }
//            }
//            else if (choice == 3) {
//                account.showBalance();
//            } else if (choice == 4) {
//                bank.printTotal();
//            }
//        }
//        input.close();
//    }
//}
