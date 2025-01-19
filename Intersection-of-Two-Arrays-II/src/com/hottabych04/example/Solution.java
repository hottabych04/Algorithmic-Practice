package com.hottabych04.example;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersectionContains = new LinkedList<>();

        for (int i = 0; i < nums2.length; i++){
            for (int j = 0; j < nums1.length; j++){
                if (nums2[i] == nums1[j]) {
                    intersectionContains.add(nums1[j]);
                    nums1[j] = -1;
                    break;
                }
            }
        }

        return fillArr(intersectionContains);
    }

    private int[] fillArr(List<Integer> intersectionContains){
        int[] intersection = new int[intersectionContains.size()];

        for (int i = 0; i < intersection.length; i++) {
            intersection[i] = intersectionContains.get(i);
        }

        return intersection;
    }
}
