package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxNum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 45, 12, 78, 56, 89, 21);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
