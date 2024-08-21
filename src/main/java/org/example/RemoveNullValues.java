package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValues {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", null, "banana", null, "cherry");

        List<String> nonNullWords = words.stream()
                .filter(word -> word != null)
                .collect(Collectors.toList());

        System.out.println(nonNullWords);
    }
}
