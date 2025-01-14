package com.hottabych04.example;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null, curr = head, next;

        while (curr.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        curr.next = prev;

        return curr;
    }
}
