package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 5, 7, 1);

        Optional<Integer> max = numbers.stream().max(Integer::compare);

        max.ifPresent(System.out::println);
    }

}
