public class Bank {
    private Account[] accounts;
    private int count;

    public Bank(int total) {
        accounts = new Account[total];
        count = 0;
    }

//    find method to check if there is an account with a particular name
    public Account find (String name) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getName().equals(name)) {
                return accounts[i];
            }
        }

        return null;
    }

//    Add an account to the array
    public void addAccount(Account a) {
        if (count < accounts.length) {
            accounts[count] = a;
            count++;
        }
        else {
            System.out.println("Bank is full - cannot add account.");
        }
    }

    public void printTotal() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total = total + accounts[i].getBalance();
        }
        System.out.printf("All deposits in the bank: $%.2f%n", total);
    }

}