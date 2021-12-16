package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int sum) {

        if (root == null) {
            return false;
        }

        sum += root.val;

        if (root.left == null && root.right == null && sum == targetSum) {
            return true;
        }

        return hasPathSum(root.left, targetSum, sum) || hasPathSum(root.right, targetSum, sum);
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
