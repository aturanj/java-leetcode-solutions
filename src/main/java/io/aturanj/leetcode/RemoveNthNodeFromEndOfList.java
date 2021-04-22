package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        List<ListNode> nodeList = new ArrayList();
        nodeList.add(head);

        var currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            nodeList.add(currentNode);
        }

        if (nodeList.size() - n < 0) {
            return null;
        }

        if (nodeList.size() - n == 0) {
            return head = head.next;
        }

        if (n == 1) {
            nodeList.get(nodeList.size() - n - 1).next = null;
            return head;
        }

        nodeList.get(nodeList.size() - n - 1).next = nodeList.get(nodeList.size() - n + 1);

        return head;
    }

    /**
     * Definition for singly-linked list
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
