package pl.coderslab.advanced.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(4,7));
        shapes.add(new Square(8));
        shapes.add(new Circle(4));

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
