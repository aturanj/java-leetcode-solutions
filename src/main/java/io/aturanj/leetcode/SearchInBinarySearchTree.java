package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val) {
            return root;
        }

        if (val > root.val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
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
