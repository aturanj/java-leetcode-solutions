package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
 */
public class SumOfNodesWithEvenValuedGrandparent {

    private int sum;

    public int sumEvenGrandparent(TreeNode root) {

        if (root == null) {
            return 0;
        }

        checkGrandChildren(root);

        return sum;
    }

    private void checkGrandChildren(TreeNode root) {

        if (root.right != null) {
            if (root.val % 2 == 0) {
                if (root.right.left != null) {
                    sum += root.right.left.val;
                }
                if (root.right.right != null) {
                    sum += root.right.right.val;
                }
            }
            checkGrandChildren(root.right);
        }

        if (root.left != null) {
            if (root.val % 2 == 0) {
                if (root.left.left != null) {
                    sum += root.left.left.val;
                }
                if (root.left.right != null) {
                    sum += root.left.right.val;
                }
            }
            checkGrandChildren(root.left);
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
