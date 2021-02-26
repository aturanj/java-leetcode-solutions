package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        List<Integer> list = new ArrayList();

        var currentNode = head;
        var lastNode = head;

        list.add(currentNode.val);

        while (currentNode.next != null) {

            if (list.contains(currentNode.next.val)) {

                currentNode = currentNode.next;

            } else {

                lastNode.next = currentNode.next;
                list.add(currentNode.next.val);

                currentNode = currentNode.next;
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
