package com.hottabych04.example;

import java.util.ArrayList;
import java.util.List;

public class RecentCounter {

    private final List<Long> queryLog = new ArrayList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        saveQuery(t);
        return count(t);
    }

    private int count(int t) {
        int count = 0;

        int querySize = queryLog.size();

        for (int i = querySize - 1; (i >= 0) && (queryLog.get(i) >= t - 3000); i--){
            count++;
        }

        return count;
    }

    private void saveQuery(int t){
        queryLog.add((long) t);
    }
}
