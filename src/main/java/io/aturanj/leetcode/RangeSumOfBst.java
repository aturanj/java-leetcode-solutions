package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumOfBst {

    private int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        traverseTree(root, low, high);
        return sum;
    }

    private void traverseTree(TreeNode root, int low, int high) {

        if (root.val <= high && root.val >= low) {
            sum += root.val;
        }

        if (root.left != null) {
            traverseTree(root.left, low, high);
        }
        if (root.right != null) {
            traverseTree(root.right, low, high);
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
