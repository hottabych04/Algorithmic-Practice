package com.hottabych04.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = parseStringToIntArray(scanner.nextLine());
        int[] nums2 = parseStringToIntArray(scanner.nextLine());

        int[] intersect = solution.intersect(nums, nums2);

        System.out.println(Arrays.toString(intersect));
    }

    public static int[] parseStringToIntArray(String input) {
        String[] stringNumbers = input.replaceAll("\\[|\\]|\\s", "").split(",");

        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        return numbers;
    }
}
