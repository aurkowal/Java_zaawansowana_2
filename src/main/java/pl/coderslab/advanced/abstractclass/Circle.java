package pl.coderslab.advanced.abstractclass;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private double r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        double result = Math.round(PI * r * r * 100.0) / 100.0;
        return result;
    }

    @Override
    public double calculatePerimeter() {
        double result = Math.round(PI * 2 * r * 100.0) / 100.0;
        return result;
    }

    @Override
    public String toString() {
        return "Koło o promieniu: " + this.r + super.toString();
    }
}
