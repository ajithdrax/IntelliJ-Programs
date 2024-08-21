package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] newArr = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));

    }
}
