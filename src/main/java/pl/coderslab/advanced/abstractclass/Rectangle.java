package pl.coderslab.advanced.abstractclass;

public class Rectangle extends Shape {
    protected double a;
    protected double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach: " + this.a + " i " + this.b + super.toString();
    }
}
