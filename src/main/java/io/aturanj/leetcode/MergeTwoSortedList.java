package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        List<ListNode> list = new ArrayList<>();

        if (l1 != null) {

            ListNode currentNode1 = l1;
            list.add(currentNode1);

            while (currentNode1.next != null) {
                currentNode1 = currentNode1.next;
                list.add(currentNode1);
            }
        }

        if (l2 != null) {

            ListNode currentNode2 = l2;
            list.add(currentNode2);

            while (currentNode2.next != null) {
                currentNode2 = currentNode2.next;
                list.add(currentNode2);
            }
        }

        list.sort((p1, p2) -> p1.val >= p2.val ? 1 : -1);

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }

        return list.size() > 0 ? list.get(0) : null;
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
