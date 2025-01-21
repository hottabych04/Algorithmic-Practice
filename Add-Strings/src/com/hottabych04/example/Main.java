package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(solution.addStrings(
                scanner.nextLine(),
                scanner.nextLine()
        ));
    }
}
