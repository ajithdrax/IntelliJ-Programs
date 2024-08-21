package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquaresOfNums {

    public static void main(String[] args) {
        int n = 10;

        List<Integer> squares = IntStream.rangeClosed(1, n)
                .map(x -> x * x)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Squares: " + squares);
    }
}
