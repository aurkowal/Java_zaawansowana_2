package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("strawberry","orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");

        fruits.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

        List<String> sortedList = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        fruits.stream().filter( e -> e.contains("c")).forEach(e -> System.out.println(e));

        int sum = fruits.stream().mapToInt(e -> e.length()).sum();
        System.out.println(sum);

        List<String> threeElements = sortedList.stream().limit(3).collect(Collectors.toList());
        System.out.println(threeElements);

    }
}
