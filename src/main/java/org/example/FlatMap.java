package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened List: " + flatList);
    }
}
