package pl.coderslab.advanced.functionalinterfaces.zad3;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);

}


