package com.hottabych04.example;

public class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;

        for (int zero_p = 0; zero_p < length; zero_p++){
            if (nums[zero_p] == 0){
                for (int nonZero_p = zero_p + 1; nonZero_p < length; nonZero_p++){
                    if (nums[nonZero_p] != 0) {
                        nums[zero_p] = nums[nonZero_p];
                        nums[nonZero_p] = 0;
                        break;
                    }
                }
            }
        }
    }
}
