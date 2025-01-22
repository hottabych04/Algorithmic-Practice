package com.hottabych04.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> countChars = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Integer count = countChars.getOrDefault(s.charAt(i), 0);
            countChars.put(s.charAt(i), ++count);
        }

        var uniqueCharacter = countChars.entrySet().stream()
                .filter(it -> it.getValue() == 1)
                .findFirst();

        return uniqueCharacter.map(characterIntegerEntry -> s.indexOf(characterIntegerEntry.getKey())).orElse(-1);
    }
}