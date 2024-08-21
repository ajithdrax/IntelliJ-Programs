package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        Set<Integer> commonElements = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toSet());

        System.out.println(commonElements);
    }
}

