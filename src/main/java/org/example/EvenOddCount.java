package org.example;

import java.util.Arrays;
import java.util.List;

public class EvenOddCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 45, 12, 78, 56, 89, 21);

        long evenCount = numbers.stream().filter(num -> num % 2 == 0).count();
        long oddCount = numbers.stream().filter(num -> num % 2 != 0).count();

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
