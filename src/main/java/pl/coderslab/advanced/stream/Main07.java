package pl.coderslab.advanced.stream;

import java.util.stream.Stream;

public class Main07 {
    public static void main(String[] args) {
        Stream.of(2, 4, 6, 8, 9, 10, 12).takeWhile(e -> e % 2 == 0).forEach(e -> System.out.println(e));
    }
}
