package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterByStartingChar {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apricot");

        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println("Words starting with 'a': " + filteredWords);
    }
}