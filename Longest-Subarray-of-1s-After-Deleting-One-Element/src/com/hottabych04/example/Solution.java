package com.hottabych04.example;

public class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0, i = 0, j = 0, delete = 0;

        while (j < nums.length){
            while (j < nums.length && delete < 2){
                if (nums[j] == 0){
                    delete++;
                }
                j++;
            }

            int diff = j - i - delete;
            if (diff == nums.length) diff--;
            if (diff > maxLength) maxLength = diff;

            if (delete == 2){
                while (delete == 2 && i <= j){
                    if (nums[i] == 0){
                        delete--;
                    }
                    i++;
                }
            }
        }

        return maxLength;
    }
}
