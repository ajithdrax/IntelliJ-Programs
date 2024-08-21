package org.example;

import java.util.Arrays;
import java.util.List;

public class GreaterThanThreshold {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        long count = numbers.stream()
                .filter(n -> n > 25)
                .count();

        System.out.println("Count of elements greater than 25: " + count);
    }
}
