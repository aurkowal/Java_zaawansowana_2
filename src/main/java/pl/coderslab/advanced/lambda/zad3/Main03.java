package pl.coderslab.advanced.lambda.zad3;

import java.util.function.Predicate;

public class Main03 {
    public static void main(String[] args) {
        Predicate<Object> predicate = a -> a instanceof String;
        boolean test1 = predicate.test("123");
        System.out.println(test1);

        boolean test2 = predicate.test(454);
        System.out.println(test2);

        boolean test3 = predicate.test("seven");
        System.out.println(test3);
    }
}
