package Test;

import Balance.Account;
public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000.0);
        acc.displayBalance();
    }
}
