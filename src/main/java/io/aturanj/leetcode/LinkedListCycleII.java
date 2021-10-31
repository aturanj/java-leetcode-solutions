package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {

        var set = new HashSet<ListNode>();
        var currentNode = head;

        while (currentNode != null) {
            if (!set.add(currentNode)) {
                return currentNode;
            }
            currentNode = currentNode.next;

        }

        return null;
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
