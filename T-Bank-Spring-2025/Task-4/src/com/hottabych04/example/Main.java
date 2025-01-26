package com.hottabych04.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] xyz = new int[3];

        for (int i = 0; i < 3; i++) {
            xyz[i] = scanner.nextInt();
        }

        Arrays.sort(xyz);
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        Arrays.sort(a);

        System.out.println(solution(xyz[2], xyz[1], xyz[0], a));
    }

    private static int solution(int x, int y, int z, long[] a){
        return minCount(x, a) + minCount(y, a) + minCount(z, a);
    }

    private static int minCount(long num, long[] a){
        int left = 0, right = a.length - 1, mid = 0;

        int count = (int) num, divisor = (int) num, indexAns = -1;

        while (num < a[right]+divisor){
            while (left <= right){
                mid = left + ((right - left)/2);
                if (a[mid] <= num) {
                    if (mid+1 < a.length && a[mid+1] > num) break;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            if (num - a[mid] < count){
                count = (int) (num - a[mid]);
                indexAns = mid;
                if (count == 0) break;
            }
            num += divisor;
            left = mid+1;
            right = a.length-1;
        }

        if (count == -1) return 0;

        a[indexAns] += count;

        return count;
    }
}
