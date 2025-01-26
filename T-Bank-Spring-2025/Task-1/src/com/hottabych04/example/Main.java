package com.hottabych04.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        solution(scanner.nextLine());
    }

    private static void solution(String s){
        if (s.indexOf("M") > s.indexOf("R")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
