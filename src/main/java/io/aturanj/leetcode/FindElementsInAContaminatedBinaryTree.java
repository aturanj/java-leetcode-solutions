package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 */
public class FindElementsInAContaminatedBinaryTree {

    private TreeNode root;

    public FindElementsInAContaminatedBinaryTree(TreeNode root) {

        this.root = root;
        this.root.val = 0;

        createTree(this.root);
    }

    private void createTree(TreeNode node) {

        if (node.left != null) {
            node.left.val = (node.val * 2) + 1;
            createTree(node.left);
        }

        if (node.right != null) {
            node.right.val = (node.val * 2) + 2;
            createTree(node.right);
        }
    }

    public boolean find(int target) {
        return findPreorder(root, target);
    }

    private boolean findPreorder(TreeNode node, int target) {

        if (node.val == target) {
            return true;
        }

        boolean left = false;
        boolean right = false;

        if (node.left != null) {
            left = findPreorder(node.left, target);
        }

        if (node.right != null) {
            right = findPreorder(node.right, target);
        }

        return left || right;
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
