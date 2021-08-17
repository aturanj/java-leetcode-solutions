package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/delete-leaves-with-a-given-value/
 */
public class DeleteLeavesWithAGivenValue {

    public TreeNode removeLeafNodes(TreeNode root, int target) {

        if (root == null) {
            return null;
        }

        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }

        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }

        if (root.val == target && root.left == null && root.right == null) {
            root = null;
        }

        return root;
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
