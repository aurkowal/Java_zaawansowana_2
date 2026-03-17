package pl.coderslab.advanced.functionalinterfaces.zad1;

import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        //obiekt klasy IntegerFiletr
        List<Integer> array = List.of(10, 19, 20, 30, 40);
        IntegerFilter integerFilter = new IntegerFilter();
        printList(array, integerFilter);

        // klasa anonimowa (jednorazowa)
        Filter<Integer> anonymousFilter = new Filter<>() {
            public boolean check(Integer v) {
                return v < 20;
            }
        };
        printList(array, anonymousFilter);

        //lambda
        printList(array, v -> v < 20);

    }

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

}
