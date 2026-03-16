package pl.coderslab.advanced.abstractclass;

public abstract class Shape {

     public abstract double calculateArea();
     public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return " Pole = " + calculateArea() + " Obwód = " + calculatePerimeter();
    }
}
