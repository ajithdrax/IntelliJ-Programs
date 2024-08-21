package org.example;

public class Factorial {

        public static void main(String[] args) {
            int n = 5;
            factorialNum(n);
        }
        public static void factorialNum(int n) {
            if (n < 0) {
                System.out.println("Number must be non-negative.");
            }
            else
            {
                long result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                System.out.println("Factorial of " + n + " is " + result);
            }
        }
    }




