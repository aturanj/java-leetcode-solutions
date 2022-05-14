package io.aturanj.leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/reorder-list/submissions/
 */
public class ReorderList {

    public void reorderList(ListNode head) {

        var list = new ArrayList<ListNode>();
        var current = head;

        do {
            list.add(current);
            current = current.next;
        } while (current != null);

        ListNode prev = null;
        var n = list.size() - 1;
        var m = list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1;

        for (var i = 0; i < m; i++) {
            if (prev != null) {
                prev.next = list.get(i);
            }
            if (i != n - i) {
                list.get(i).next = list.get(n - i);
            } else {
                list.get(i).next = null;
            }

            prev = list.get(n - i);

            if (list.size() % 2 == 0 && (n - i) == n - 1) {
                list.get(n - i).next = null;
            }

            //TODO: Add more checks for edge cases
        }
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
