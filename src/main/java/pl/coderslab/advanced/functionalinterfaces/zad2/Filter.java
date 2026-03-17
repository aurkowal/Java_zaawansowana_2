package pl.coderslab.advanced.functionalinterfaces.zad2;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);
}


