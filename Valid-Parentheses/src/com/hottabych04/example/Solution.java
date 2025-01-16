package com.hottabych04.example;

import java.util.Map;
import java.util.Stack;

public class Solution {

    private static final Map<Character, Character> parentheses = Map.of(
            '(',')',
            '{','}',
            '[',']'
    );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (parentheses.containsKey(c)){
                stack.push(c);
            } else if (stack.isEmpty() || !(parentheses.get(stack.pop()) == c)){
                return false;
            }
        }

        return stack.isEmpty();
    }
}
