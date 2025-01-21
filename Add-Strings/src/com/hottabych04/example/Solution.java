package com.hottabych04.example;

public class Solution {
    public String addStrings(String num1, String num2) {

        boolean modulo = false;

        if (num1.length() < num2.length()){
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        char[] chars = new char[num1.length()];

        int i = num1.length()-1, j = num2.length()-1;

        for (;
                j >= 0;
                i--, j--
        ) {
            int sum = (num1.charAt(i) - '0') + (num2.charAt(j) - '0');
            if (modulo) {
                sum++;
                modulo = false;
            }
            if (sum >= 10) {
                modulo = true;
                sum -= 10;
            }
            chars[i] = (char) (sum + '0');
        }

        if (i >=0){
            for (; i >= 0; i--) {
                int num = (num1.charAt(i) - '0');
                if (modulo) {
                    num++;
                    modulo = false;
                }
                if (num >= 10) {
                    modulo = true;
                    num -= 10;
                }
                chars[i] = (char) (num + '0');
            }
        }

        if (modulo){
            char[] chars2 = new char[chars.length + 1];
            chars2[0] = 1 + '0';

            for (int k = 1; k < chars2.length; k++) {
                chars2[k] = chars[k-1];
            }

            return String.valueOf(chars2);
        }

        return String.valueOf(chars);
    }
}
