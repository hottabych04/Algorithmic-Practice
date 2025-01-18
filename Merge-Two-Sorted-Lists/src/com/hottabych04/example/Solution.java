package com.hottabych04.example;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head;
        if (list1.val <= list2.val){
            head = list1;
            listsSort(list1, list2);
        } else {
            head = list2;
            listsSort(list2, list1);
        }

        return head;
    }

    private void listsSort(ListNode list1, ListNode list2){
        while (list1 != null && list2 != null){

            ListNode list1next = list1.next;
            ListNode list2next = list2.next;

            if (list1.next == null){
                if (list2 != null){
                    list1.next = list2;
                    break;
                }
            }

            if (list1.next.val > list2.val){
                list1.next = list2;
                list2.next = list1next;
                list1 = list2;
                list2 = list2next;
            } else {
                list1 = list1next;
            }
        }
    }
}
