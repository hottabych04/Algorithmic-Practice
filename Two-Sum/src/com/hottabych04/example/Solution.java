package com.hottabych04.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        Map<Integer, Integer> duplicatesValuesIndex = new HashMap<>();

        int length = nums.length;

        for (int i = 0; i < length; i++){
            if (indexes.containsKey(nums[i])){
                duplicatesValuesIndex.put(nums[i], i);
            } else {
                indexes.put(nums[i], i);
            }
        }

        Arrays.sort(nums);

        for (int i = 0; i < length; i++){
            int left = i+1, right = length-1;
            while (left<=right){
                int j = left + (right - left) / 2;

                int sum = nums[i] + nums[j];

                if (sum == target){
                    if (nums[i] == nums[j]){
                        return new int[]{indexes.get(nums[i]), duplicatesValuesIndex.get(nums[j])};
                    } else {
                        return new int[]{indexes.get(nums[i]), indexes.get(nums[j])};
                    }
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
