package pl.coderslab.advanced.designpatterns.zad3;

public class AtmApi {
    private BankAccount bankAccount;
    private Transfer transfer;
    private PhoneCard phoneCard;
    private Loan loan;

    public AtmApi(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.transfer = new Transfer();
        this.phoneCard = new PhoneCard();
        this.loan = new Loan();
    }

    public void deposit(double amount) {
        bankAccount.deposit(amount);
    }


    public void payOut(double amount) {
        bankAccount.payOut(amount);
    }

    public void transferMoney(String fromAccount, String toAccount, double amount) {
        transfer.transferMoney(fromAccount, toAccount, amount);
    }

    public void rechargePhone(String phoneNumber, double amount) {
        phoneCard.recharge(phoneNumber, amount);
    }

    public void getLoan(String clientId, double amount) {
        loan.getLoan(clientId, amount);
    }

}
