package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int[] nums = parseStringToIntArray(line);

        System.out.println(solution.removeDuplicates(nums));
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
