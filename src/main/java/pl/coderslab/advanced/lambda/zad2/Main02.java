package pl.coderslab.advanced.lambda.zad2;

import java.util.function.Predicate;

public class Main02 {
    public static void main(String[] args) {

        Predicate<Object> predicate = a -> a instanceof Number;
        boolean test1 = predicate.test(123);
        System.out.println(test1);

        boolean test2 = predicate.test(4f);
        System.out.println(test2);

        boolean test3 = predicate.test("seven");
        System.out.println(test3);

    }
}
