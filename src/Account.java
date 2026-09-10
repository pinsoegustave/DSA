public class Account {
    private String name;
    private double balance;

    public Account (String Sname, double Sbalance) {
        Sname = name;
        Sbalance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }

        balance = balance - amount;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s: Your balance = $%.2f", name, balance);
    }

//    Override


}
