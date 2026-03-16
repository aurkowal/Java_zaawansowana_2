package pl.coderslab.advanced.designpatterns.zad4;

import java.util.ArrayList;
import java.util.List;

public class Post implements Subject{
    private String content;
    private String title;

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(title);
        }
    }

    public void share() {
        System.out.println("UPDATE OBSERVERS");
        notifyObservers();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
