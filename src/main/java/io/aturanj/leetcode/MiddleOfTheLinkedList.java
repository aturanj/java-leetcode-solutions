package io.aturanj.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {

        var currentNode = head;
        var index = 1;
        var map = new HashMap<Integer, ListNode>();
        map.put(index, currentNode);

        while (currentNode.next != null) {
            index++;
            currentNode = currentNode.next;
            map.put(index, currentNode);
        }

        return map.get(map.size() / 2 + 1);
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
