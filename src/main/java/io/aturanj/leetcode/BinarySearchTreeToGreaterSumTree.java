package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class BinarySearchTreeToGreaterSumTree {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {

        if (root != null) {

            bstToGst(root.right);

            sum += root.val;

            root.val = sum;

            bstToGst(root.left);
        }

        return root;
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
