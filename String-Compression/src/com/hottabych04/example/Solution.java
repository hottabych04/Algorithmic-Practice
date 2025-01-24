package com.hottabych04.example;

public class Solution {
    public int compress(char[] chars) {
        int symbolIndex = 0, count = 0, lastSymbolIndex = 0;

        for (int i = 0; i <= chars.length; i++) {
            if (i >= chars.length || chars[i] != chars[symbolIndex]){
                count = i - symbolIndex;
                chars[lastSymbolIndex] = chars[symbolIndex];
                symbolIndex = lastSymbolIndex;
                if (count != 1) {
                    int pow = 1;
                    while (count%Math.pow(10, pow) != count){
                        pow++;
                    }
                    pow--;
                    while (pow >= 0){
                        symbolIndex++;
                        int num = (int) (count / Math.pow(10, pow));
                        chars[symbolIndex] = (char) (num + '0');
                        count -= ((int) Math.pow(10, pow)) * num;
                        pow--;
                    }
                }
                lastSymbolIndex = symbolIndex + 1;
                symbolIndex = i;
            }
        }

        return lastSymbolIndex;
    }
}
