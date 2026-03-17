package pl.coderslab.advanced.functionalinterfaces.zad3;

@FunctionalInterface
public interface Transform<T, S> {

    T transform(S s);
}
