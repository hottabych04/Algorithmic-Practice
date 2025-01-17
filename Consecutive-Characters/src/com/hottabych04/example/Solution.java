package com.hottabych04.example;


public class Solution {
    public int maxPower(String s) {
        char[] chars = s.toCharArray();

        int power = 1;
        int prev = 0;
        int length;

        for (int i = 0; i < chars.length; i++){
            if (chars[prev] != chars[i] || i + 1 == chars.length){
                if (i + 1 < chars.length || chars[prev] != chars[i]){
                    length = i - prev;
                } else {
                    length = i - prev + 1;
                }
                prev = i;
                if (length > power) power = length;
            }
        }

        return power;
    }
}
