package com.hottabych04.example;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] subseq = s.toCharArray();
        char[] source = t.toCharArray();

        int i = 0, j = 0;

        while (i < subseq.length && j < source.length){
            if (subseq[i] == source[j]){
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i == subseq.length) return true;

        return false;
    }
}
