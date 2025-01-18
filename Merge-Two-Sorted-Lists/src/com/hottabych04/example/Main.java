package com.hottabych04.example;

import java.util.Scanner;

public class Main {

    private final static Solution solution = new Solution();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListNode linkedlist1 = parseStringToLinkedList(scanner.nextLine());
        ListNode linkedlist2 = parseStringToLinkedList(scanner.nextLine());

        ListNode mergedList = solution.mergeTwoLists(linkedlist1, linkedlist2);

        printList(mergedList);
    }

    public static ListNode parseStringToLinkedList(String input) {
        String[] stringNumbers = input.replaceAll("\\[|\\]|\\s", "").split(",");

        if (stringNumbers[stringNumbers.length - 1].isEmpty()){
            return null;
        }

        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        ListNode temp = new ListNode(numbers[numbers.length - 1]);

        for (int i = numbers.length - 2; i >= 0; i--){
            temp = new ListNode(numbers[i], temp);
        }

        return temp;
    }

    public static void printList(ListNode list){
        if (list == null){
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        while (list.next != null) {
            System.out.print(list.val + ",");
            list = list.next;
        }
        System.out.print(list.val + "]\n");
    }
}
