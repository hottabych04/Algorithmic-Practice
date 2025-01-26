package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        long[] sums = new long[sumsSize(n)];

        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                sums[l] = nums[i] + nums[j];
                l++;
            }
        }

        for (int p = 1; p <= k; p++) {
            System.out.println(solution(sums, p));
        }
    }

    private static long solution(long[] sums, int p){
        long sum = 0;

        for (int i = 0; i < sums.length; i++) {
            sum += (long) Math.pow(sums[i], p);
        }

        return sum % 998244353;
    }

    private static int sumsSize(int n){
        int size = 0;
        for (int i = 1; i < n; i++) {
            size += i;
        }

        return size;
    }
}
