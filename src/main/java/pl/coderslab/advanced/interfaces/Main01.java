package pl.coderslab.advanced.interfaces;

public class Main01 {
    public static void main(String[] args) {
        Moveable[] moveableTab = new Moveable[3];
        moveableTab[0] = new Cat();
        moveableTab[1] = new Car();
        moveableTab[2] = new Person();

        for (int i = 0; i < moveableTab.length; i++) {
            moveableTab[i].start();
        }
    }
}
