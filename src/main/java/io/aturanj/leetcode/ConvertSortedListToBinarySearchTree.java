package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 */
public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode previous = null, slow = head, fast = head;

        //find middle node
        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        //disconnect left half of list
        if (previous != null) {
            previous.next = null;
        }

        System.out.println(
                "head: " + (head != null ? head.val : "null")
                + " previous: " + (previous != null ? previous.val : "null")
                + " slow: " + (slow != null ? slow.val : "null")
                + " fast: " + (fast != null ? fast.val : "null")
        );

        var root = new TreeNode(slow.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        return root;
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode {

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

    /**
     * Definition for a binary tree node.
     */
    class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
