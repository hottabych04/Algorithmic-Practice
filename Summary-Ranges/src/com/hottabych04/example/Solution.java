package com.hottabych04.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final static String RANGE_FORMAT = "%d->%d";

    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        int left_p = 0, right_p = 0;
        int length = nums.length;

        while (right_p < length){
            while (nums[right_p] - nums[left_p] == right_p - left_p){
                ++right_p;

                if (right_p == length) {
                    break;
                }
            }

            if (right_p - left_p == 1 || right_p - left_p == 0){
                ranges.add(String.valueOf(nums[left_p]));
            } else {
                ranges.add(String.format(RANGE_FORMAT, nums[left_p], nums[right_p-1]));
            }

            left_p = right_p;
        }

        return ranges;
    }
}
