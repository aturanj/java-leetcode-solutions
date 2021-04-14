package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/symmetric-tree/
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return checkSymmetric(root.right, root.left);
    }

    private boolean checkSymmetric(TreeNode right, TreeNode left) {

        if (right == null || left == null) {
            return right == left;
        }

        if (right.val != left.val) {
            return false;
        }

        return checkSymmetric(right.left, left.right) && checkSymmetric(left.left, right.right);
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
