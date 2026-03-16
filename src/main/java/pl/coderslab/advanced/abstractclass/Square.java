package pl.coderslab.advanced.abstractclass;

//public class Square extends Shape {
//    private double a;
//
//    public Square(double a) {
//        this.a = a;
//    }
//
//    @Override
//    public double calculateArea() {
//        return a * a;
//    }
//
//    @Override
//    public double calculatePerimeter() {
//        return 4 * a;
//    }
//
//    @Override
//    public String toString() {
//        return "Kwadrat o boku: " + this.a + super.toString();
//    }
//}

public class Square extends Rectangle {
    public Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Kwadrat o boku: " + this.a + " Pole = " + super.calculateArea() + " Obwód = " + super.calculatePerimeter();
    }

}
