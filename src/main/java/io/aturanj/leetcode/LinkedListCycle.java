package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        List<ListNode> list = new ArrayList<>();
        list.add(head);

        var currentNode = head;

        while (currentNode.next != null) {

            if (list.contains(currentNode.next)) {
                return true;
            }

            currentNode = currentNode.next;
            list.add(currentNode);
        }

        return false;
    }
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
