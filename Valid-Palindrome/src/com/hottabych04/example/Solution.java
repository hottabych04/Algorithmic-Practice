package com.hottabych04.example;

public class Solution {
    public boolean isPalindrome(String s) {
        String replaced = s.toLowerCase().replaceAll("[^a-z\\d]", "");
        char[] chars = replaced.toCharArray();
        int length = chars.length;
        char[] reversedArr = new char[length];

        for (int i = 0; i < length; i++){
            reversedArr[i] = chars[length-i-1];
        }

        String reversedStr = String.valueOf(reversedArr);

        return reversedStr.equals(replaced);
    }
}
