package pl.coderslab.advanced.designpatterns.zad3;

public class Transfer {

    public void transferMoney(String fromBA, String toBA, double amount) {
        System.out.println("Przelew środków od " + fromBA + " do " + toBA + " w wysokości " + amount);
    }
}
