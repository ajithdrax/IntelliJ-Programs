package org.example;

public class SecondLargestNum {

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        Integer secondLargest = findSecondLargest(numbers);

        if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("The array does not have enough distinct elements.");
        }
    }



    public static Integer findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
