package com.hottabych04.example;

public class Main {
    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();

        System.out.println(counter.ping(1));
        System.out.println(counter.ping(2));
        System.out.println(counter.ping(3));
        System.out.println(counter.ping(4000));
    }
}
