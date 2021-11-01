package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        var current = head;
        var previous = head;

        while (current != null) {
            if (current.val == val && current == head) {
                head = head.next;
                current = current.next;
            } else if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }

        return head;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {

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
}
