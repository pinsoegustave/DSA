// *******************************************************************
//                  Pinsoe Gustave
//
//              Program #2 due 09/10/2026
//     This file contains Account functions that a user can do with their
//         account. It contains methods to show the user their balance,
//            adding money to their account, as well as withdrawing.
// *******************************************************************

public class Account {
    private String name;
    private double balance;

    public Account (String argName, double argBalance) {
        name = argName;
        balance = argBalance;
    }

//    Method to print the balance of the user
    public void showBalance() {
        System.out.printf("%s: Your balance = $%.2f%n", name, balance);
    }

//    Getter method to help access the user's name.
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;
    }

//    Method to help on withdraw function
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }

//    toString method to help print balance message
    public String toString() {
        return String.format("%s: Your balance = $%.2f", name, balance);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account other)) {
            return false;
        }
        return name.equals(other.name) && this.balance == other.balance;
    }

}
