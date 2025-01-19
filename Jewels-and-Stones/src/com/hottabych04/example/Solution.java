package com.hottabych04.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> stonesCount = new HashMap<>();

        for (char c : stones.toCharArray()) {
            Integer count = stonesCount.get(c);

            if (count == null) {
                stonesCount.put(c, 1);
            } else {
                stonesCount.put(c, ++count);
            }
        }

        int jewelsCount = 0;

        for (char c : jewels.toCharArray()) {
            Integer count = stonesCount.get(c);

            if (count != null) jewelsCount += count;
        }

        return jewelsCount;
    }
}
