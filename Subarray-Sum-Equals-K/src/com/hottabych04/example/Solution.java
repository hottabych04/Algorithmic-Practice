package com.hottabych04.example;

import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sums = new HashMap<>();
        int count = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sums.containsKey(sum - k)){
                count += sums.get(sum-k);
            }
            if(sum == k)count++;
            sums.put(sum , sums.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
}
