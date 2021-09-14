package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/same-tree/discuss/1463071/recursion
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            return p == q;
        }

        if (p.val != q.val) {
            return false;
        }

        boolean right = true;
        boolean left = true;

        if (p.right != null && q.right != null) {
            right = isSameTree(p.right, q.right);
        }

        if (p.left != null && q.left != null) {
            left = isSameTree(p.left, q.left);
        }

        if ((p.right != null && q.right == null) || (p.right == null && q.right != null)) {
            return false;
        }

        if ((p.left != null && q.left == null) || (p.left == null && q.left != null)) {
            return false;
        }

        return right && left;
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {

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
