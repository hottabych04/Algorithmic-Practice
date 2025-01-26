package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = scanner.nextLong();

        int[] sticks = new int[n];

        for (int i = 0; i < n; i++) {
            sticks[i] = scanner.nextInt();
        }

        long count = 0;

        for (int l = 0; l < n; l++){
            for (int r = l; r < n; r++){
                count += solution(l, r, s, sticks);
            }
        }

        System.out.println(count);
    }

    private static long solution(int l, int r, long s, int[] sticks){
        long count = 0;
        long sum = 0;

        for (; l <= r; l++){
            if (sum + sticks[l] <= s){
                sum += sticks[l];
            } else {
                count++;
                sum = sticks[l];
            }
            if (l == r) count++;
        }

        return count;
    }
}
