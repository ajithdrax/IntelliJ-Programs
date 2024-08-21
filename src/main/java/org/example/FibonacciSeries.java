package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10;
        fibonacciNums(count);
    }

    public static void fibonacciNums(int count) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);
        for (int i = 2; i < count; i++) {
            int num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}

