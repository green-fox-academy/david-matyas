package com.testing;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String sourceString = "Ahoj";
        String anagramString = "johA";
        System.out.println(isAnagram(sourceString,anagramString));
    }
    public static boolean isAnagram(String s, String anagram) {
        s = s.toLowerCase();
        anagram = anagram.toLowerCase();
        char[] usedChar1 = s.toCharArray();
        char[] usedChar2 = anagram.toCharArray();
        Arrays.sort(usedChar1);
        Arrays.sort(usedChar2);
        return Arrays.compare(usedChar1, usedChar2) == 0;
    }
}
