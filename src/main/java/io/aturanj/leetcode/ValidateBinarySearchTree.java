package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer max, Integer min) {

        if (node == null) {
            return true;
        } else if ((max != null && node.val >= max) || (min != null && node.val <= min)) {
            return false;
        } else {
            return validate(node.right, max, node.val) && validate(node.left, node.val, min);
        }
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
