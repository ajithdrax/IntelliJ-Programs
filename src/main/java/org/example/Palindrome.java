package org.example;

public class Palindrome {
    public static String checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return str + " is not a palindrome.";
            }
            i++;
            j--;
        }
        return str + " is a palindrome.";
    }

    public static void main(String[] args) {
        String str = "racecar";
        String c = checkPalindrome(str);
        System.out.println(c);
    }
}