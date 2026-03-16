package pl.coderslab.advanced.designpatterns.zad1;

public class Main01 {
    public static void main(String[] args) {
        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        System.out.println(appConfig1 == appConfig2);
    }
}
