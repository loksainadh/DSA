package com.example;
import java.util.HashMap;
import java.util.Map;

public class RepetitiveCharacterCount {
    public static void main(String[] args) {
        String input = "geetha";
        countRepetitiveCharacters(input);
    }

    public static void countRepetitiveCharacters(String str) {
        Map<Character, Integer> m = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            m.put(ch, m.getOrDefault(ch, 0) + 1);
        }

        // Print all characters with their count
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
