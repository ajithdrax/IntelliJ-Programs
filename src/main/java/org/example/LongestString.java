package org.example;

import java.util.Arrays;
import java.util.List;

public class LongestString {

    public static void main(String[] args) {
            List<String> words = Arrays.asList("apple", "banana", "cherry", "watermelon");

        String longest = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse(null);

        System.out.println("Longest word: " + longest);
    }
}
