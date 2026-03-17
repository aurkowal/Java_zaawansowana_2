package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("strawberry","orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        fruits.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("A") || s.startsWith("S"))
                .sorted()
                .forEach(s -> System.out.println(s));

        Map<Integer, List<String>> grouped = fruits.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);

        List<String> result = fruits.stream().filter(s -> s.length() == 5).distinct().collect(Collectors.toList());
        System.out.println(result);

        String sortedThreeLetters = fruits.stream().map(s -> s.substring(0,3)).sorted().collect(Collectors.joining(","));
        System.out.println(sortedThreeLetters);

    }
}
