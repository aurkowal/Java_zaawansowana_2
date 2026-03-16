package pl.coderslab.advanced.designpatterns.zad3;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Wpłacono " + amount + "zł, Razem: " + balance);
    }

    public void payOut (double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Brak środków");
        }
        balance -= amount;
        System.out.println("Wypłacono " + amount + "zł, zostało: " + balance);
    }
}
