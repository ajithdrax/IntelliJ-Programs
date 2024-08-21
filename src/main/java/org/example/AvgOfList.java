package org.example;

import java.util.Arrays;
import java.util.List;

public class AvgOfList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        double averageOfNums = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average: " + averageOfNums);

    }
}


