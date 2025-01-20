package com.hottabych04.example;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;

        for (int i = 0; i < length; i++){
            int left = i+1, right = length-1;
            while (left<=right){
                int j = left + (right - left) / 2;

                int sum = numbers[i] + numbers[j];

                if (sum == target){
                    return new int[]{i+1, j+1};
                } else if (sum < target) {
                    left = j + 1;
                } else if (sum > target) {
                    right = j - 1;
                }
            }
        }

        return null;
    }
}
