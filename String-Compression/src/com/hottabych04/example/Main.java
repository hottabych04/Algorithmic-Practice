package com.hottabych04.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        System.out.println(solution.compress(chars));
        System.out.println(Arrays.toString(chars));
    }
}
