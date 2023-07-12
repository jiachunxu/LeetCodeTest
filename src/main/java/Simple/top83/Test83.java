package com0083;

public class Test83 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(2);
        new Solution().deleteDuplicates(listNode);

    }
}


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null ){
            return head;
        }


        ListNode node = head;


        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }

        }

        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}