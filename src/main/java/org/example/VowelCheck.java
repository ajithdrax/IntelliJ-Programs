package org.example;

public class VowelCheck {

    public static void main(String[] args) {
        String word = "ajith";

        boolean hasVowel = checkForVowel(word);

        if (hasVowel) {
            System.out.println("The string \"" + word + "\" contains at least one vowel.");
        } else {
            System.out.println("The string \"" + word + "\" does not contain any vowels.");
        }
    }

    public static boolean checkForVowel(String str) {
        str = str.toLowerCase();
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                return true;
            }
        }

        return false;
    }
}


