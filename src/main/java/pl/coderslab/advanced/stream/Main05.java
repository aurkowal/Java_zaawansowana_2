package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("strawberry","orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        Map<String, String> fruitsReverse = fruits.stream().collect(Collectors.toMap(
                e -> e,
                e -> new StringBuilder(e).reverse().toString()
        ));

        System.out.println(fruitsReverse);
    }
}
