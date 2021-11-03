package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        var set = new HashSet<ListNode>();
        var currentNode = headA;

        do {
            set.add(currentNode);
            currentNode = currentNode.next;
        } while (currentNode != null);

        currentNode = headB;

        do {
            if (!set.add(currentNode)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        } while (currentNode != null);

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
