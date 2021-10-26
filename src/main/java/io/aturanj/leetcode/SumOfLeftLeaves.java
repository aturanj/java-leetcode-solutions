package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return calculate(root.left, true) + calculate(root.right, false);
    }

    private int calculate(TreeNode root, boolean leftLeaf) {
        if (root == null) {
            return 0;
        }
        if (leftLeaf && root.left == null && root.right == null) {
            return root.val;
        } else {
            return calculate(root.left, true) + calculate(root.right, false);
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
