package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEvenNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaresOfEvenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Squares of Even Numbers: " + squaresOfEvenNumbers);
    }
}
