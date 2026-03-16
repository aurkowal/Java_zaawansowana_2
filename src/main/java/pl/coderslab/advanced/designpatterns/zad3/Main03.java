package pl.coderslab.advanced.designpatterns.zad3;

public class Main03 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000);
        AtmApi atm = new AtmApi(bankAccount);
        atm.deposit(1000);
        atm.payOut(3000);
        atm.getLoan("1234",4000);
        atm.rechargePhone("123456789", 60);
        atm.transferMoney("1234365654","4563432423", 1999);
    }
}
