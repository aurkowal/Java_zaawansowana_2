package pl.coderslab.advanced.lambda.zad1;

import pl.coderslab.advanced.designpatterns.zad3.PhoneCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        String word = "";

        Scanner scanner = new Scanner(System.in);

        while (!word.equals("quit")) {
            word = scanner.next();
            if (!word.equals("quit")) {
                words.add(word);
            }
        }

        words.sort((a, b) -> b.compareToIgnoreCase(a));

        for (String existingWord : words) {
            System.out.println(existingWord);
        }


    }
}
