package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long[] burleys = new long[n];

        for (int i = 0; i < n; i++) {
            burleys[i] = scanner.nextLong();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(solution(burleys[i]));
        }
    }

    private static long solution(long ai){
        double power = Math.floor(Math.log((double) ai) / Math.log(2));

        while (power >= 2){
            double firstFlowerCost = Math.pow(2, power);
            double diff = ai - firstFlowerCost;
            if (diff >= 3){
                double diffPower = Math.floor(Math.log(diff) / Math.log(2));
                while (diffPower >= 1 ){
                    if (diffPower < power){
                        double secondFlowerCost = Math.pow(2, diffPower);
                        double diff2 = diff - secondFlowerCost;
                        if (diff2 >= 1){
                            double diffPower2 = Math.floor(Math.log(diff2) / Math.log(2));
                            while (diffPower2 >= 0 ){
                                double sum = firstFlowerCost + secondFlowerCost + Math.pow(2, diffPower2);
                                if (sum <= ai && diffPower2 < diffPower){
                                    return (long) sum;
                                }
                                diffPower2--;
                            }
                        }
                    }
                    diffPower--;
                }
            }
            power--;
        }

        return -1;
    }
}
