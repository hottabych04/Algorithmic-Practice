package com.hottabych04.example;

public class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int i = 0, j = 0, space;
        char temp;

        while (i < chars.length){
            if (j == chars.length || chars[j] == ' '){
                space = j--;
                while (i < j){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    i++;
                    j--;
                }
                j = i = ++space;
            } else {
                j++;
            }
        }

        return String.valueOf(chars);
    }
}
