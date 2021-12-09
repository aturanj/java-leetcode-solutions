package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class ConvertBinaryNumberInLinkedListToInteger {

    public int getDecimalValue(ListNode head) {

        var currentNode = head;
        var sb = new StringBuilder();

        while (currentNode != null) {
            sb.append(currentNode.val);
            currentNode = currentNode.next;
        }

        return Integer.parseInt(sb.toString(), 2);
    }

    /**
     * Definition for singly-linked list.
     */
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
}
