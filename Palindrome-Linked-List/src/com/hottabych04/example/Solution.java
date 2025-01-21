package com.hottabych04.example;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        int size = 1;

       while (fast.next != null) {
            slow = slow.next;
            for (int j = 0; j < 2; j++) {
                fast = fast.next;
                size++;
                if (fast.next == null) break;
            }
        }

        if (size == 1) return true;

        ListNode next, prev = null;

        while (head.next != slow){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        if (size%2 != 0){
            slow = slow.next;
        }

        head.next = prev;


        while (head != null && slow != null){
            if (head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }

        return true;
    }
}
