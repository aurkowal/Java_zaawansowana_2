package pl.coderslab.advanced.designpatterns.zad4;

public class TwitterObserver implements Observer{

    @Override
    public void update(String title) {
        System.out.println("Nowy post na Twitterze " + title);
    }
}
