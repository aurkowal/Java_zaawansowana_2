package pl.coderslab.advanced.functionalinterfaces.zad2;

import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 19, 20, 30, 40);
        IntegerTransform integerTransform = new IntegerTransform();
        Filter<Integer> anonymousFilter = new Filter<>() {
            public boolean check (Integer v){
                return v < 20;
            }
        };
        printList(list, anonymousFilter, integerTransform);
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
