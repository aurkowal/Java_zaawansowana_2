package pl.coderslab.advanced.designpatterns.zad2;

import pl.coderslab.advanced.designpatterns.zad1.Product;

public class ConcreteCreator implements Creator {

    @Override
    public Product createProduct(String type) {
        if ("simple".equals(type)) {
            return new SimpleProduct();
        }
        if ("advanced".equals(type)) {
            return new AdvancedProduct();
        }
        if ("virtual".equals(type)) {
            return new VirtualProduct();
        }
        throw new IllegalArgumentException("Unrecognized product type");
    }
}
