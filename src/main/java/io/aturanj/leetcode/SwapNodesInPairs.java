package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode tempNode = null;
        ListNode currentNode = head;
        ListNode returnNode = head.next;
        ListNode lastNode = null;

        while (currentNode.next != null) {

            tempNode = currentNode.next;

            if (lastNode != null) {
                lastNode.next = tempNode;
            }

            currentNode.next = tempNode.next;

            tempNode.next = currentNode;

            if (currentNode.next != null) {
                lastNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        return returnNode;
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
