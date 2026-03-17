package pl.coderslab.advanced.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main06 {
    public static void main(String[] args) {
        Stream.of(2, 4, 6, 8, 9, 10, 12).dropWhile(e -> e % 2 == 0).forEach(e -> System.out.println(e));
    }
}
