package pl.coderslab.advanced.designpatterns.zad2;

import pl.coderslab.advanced.designpatterns.zad1.Product;

public class AdvancedCreator extends ConcreteCreator{
    @Override
    public Product createProduct(String type) {
        if ("super".equals(type)) {
            return new SuperProduct();
        }
        return super.createProduct(type);
    }
}
