package pl.coderslab.advanced.designpatterns.zad2;

import pl.coderslab.advanced.designpatterns.zad1.Product;

public class VirtualProduct implements Product {
    @Override
    public String getName() {
        return "I am VirtualProduct";
    }
}
