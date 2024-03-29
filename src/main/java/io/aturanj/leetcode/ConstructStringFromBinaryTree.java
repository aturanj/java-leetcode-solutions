package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode root) {

        if (root == null) {
            return "";
        }

        if (root.left == null && root.right == null) {
            return root.val + "";
        }

        var sb = new StringBuilder();
        sb.append(root.val);

        sb.append("(").append(tree2str(root.left)).append(")");

        if (root.right != null) {
            sb.append("(").append(tree2str(root.right)).append(")");
        }

        return sb.toString();
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
