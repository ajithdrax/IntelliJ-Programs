package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCount {

    public static void main(String[] args) {
        String text = "hello world hello everyone in the world of Java";

        Map<String, Long> wordCount = Arrays.stream(text.split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word frequency: " + wordCount);
    }
}
