package pl.coderslab.advanced.designpatterns.zad2;

import pl.coderslab.advanced.designpatterns.zad1.Product;

public interface Creator {
    Product createProduct(String type);
}
