package pl.coderslab.advanced.designpatterns.zad2;

import pl.coderslab.advanced.designpatterns.zad1.Product;

public class Main02 {
    public static void main(String[] args) {
        Creator factory = new ConcreteCreator();
        Product someProduct = factory.createProduct("simple");
        System.out.println(someProduct.getName());
    }
}
