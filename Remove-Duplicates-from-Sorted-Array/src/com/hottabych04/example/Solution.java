package com.hottabych04.example;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = -101;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev){
                nums[k] = prev = nums[i];
                k++;
            }
        }

        return k;
    }
}
