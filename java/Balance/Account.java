package Balance;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}