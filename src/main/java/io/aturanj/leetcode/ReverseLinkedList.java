package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        var temp = head.next;

        var other = reverseList(temp);

        head.next = null;

        temp.next = head;

        return other;
    }

    /**
     * Definition for singly-linked list
     *
     */
    class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
