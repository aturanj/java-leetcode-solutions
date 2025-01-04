package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 */
public class SwapNodesInPairsII {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;
        swapPairs(head, null);
        return second;
    }

    private void swapPairs(ListNode current, ListNode prev) {

        if (current == null || current.next == null) {
            return;
        }

        var second = current.next;
        var next = second.next;

        second.next = current;
        current.next = next;

        if (prev != null) {
            prev.next = second;
        }

        swapPairs(next, current);
    }
}
