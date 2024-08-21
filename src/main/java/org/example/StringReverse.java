package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {


    public static void main(String[] args) {
        String str = "ajith";
        System.out.println(reverse(str));
    }
    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        else {
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        }
    }

}