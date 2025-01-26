package com.hottabych04.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int[] days = new int[n-2];

        for (int i = 0; i < days.length; i++) {
            days[i] = scanner.nextInt();
        }

        System.out.println(solution(m, min, max, days));
    }

    private static int solution(int m, int min, int max, int[] days){
        int countChanges = 0;
        Integer left = null, right = null;

        Arrays.sort(days);

        for (int i = 0; i < days.length; i++) {
            if (days[i] >= min){
                left = i;
                for (int j = i; j < days.length; j++) {
                    if (days[j] <= max) {
                        right = j;
                    }
                }
                break;
            }
        }

        if (right == null || right < left) {
            if (left == null){
                if (days[0] > max) {
                    left = right = 0;
                } else {
                    left = right = days.length - 1;
                }
            } else {
                right = left;
            }
        }

        int daysLeft = m - (right - left);

        while (daysLeft > 0){
            if (max < days[right] || min > days[left]){
                if (min > days[left] && max >= days[right]){
                    while (days[left] - min != 0){
                        days[left]++;
                        countChanges++;
                    }
                } else if (max < days[right] && min <= days[left]) {
                    while (days[right] - max != 0){
                        days[right]--;
                        countChanges++;
                    }
                } else {
                    if (min - days[left] <= days[right] - max){
                        while (days[left] - min != 0){
                            days[left]++;
                            countChanges++;
                        }
                    } else {
                        while (days[right] - max != 0){
                            days[right]--;
                            countChanges++;
                        }
                    }
                }
            }

            if (days[right] >= min && days[right] <= max) {
                if (right + 1 < days.length){
                    right++;
                }
            }

            if (days[left] >= min && days[left] <= max){
                if (left - 1 >= 0){
                    left--;
                }
            }

            daysLeft--;
        }

        return countChanges;
    }
}
