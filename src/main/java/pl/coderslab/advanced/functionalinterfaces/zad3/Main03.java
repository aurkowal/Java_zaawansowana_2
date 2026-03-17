package pl.coderslab.advanced.functionalinterfaces.zad3;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        Filter<Integer> integerFilter = new Filter<>() {
            public boolean check (Integer v){
                return v < 20;
            }
        };
        Transform<Integer, Integer> integerTransform = new Transform<>() {
            public Integer transform(Integer s) {
                return s == null ? null : s - 1;
            }
        };

        List<Integer> list = List.of(10, 19, 20, 30, 40);

        System.out.println(create(list, integerFilter, integerTransform));


    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<T> createdList = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                createdList.add(t.transform(s));
            }
        }
        return createdList;
    }

}
