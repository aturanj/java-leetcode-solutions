package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDeptOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return check(root, 0);
    }

    private int check(TreeNode root, int dept) {

        if (root == null) {
            return Integer.MAX_VALUE;
        }

        var levelDept = dept + 1;

        if (root.left == null && root.right == null) {
            return levelDept;
        }

        var left = check(root.left, levelDept);
        var right = check(root.right, levelDept);

        return left < right ? left : right;
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
