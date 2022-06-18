package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTree {

    List list = new ArrayList<TreeNode>();

    public TreeNode increasingBST(TreeNode root) {
        //TODO: add logic
        return root;
    }

    private void traverse(TreeNode root) {
        //InOrder traversing
        increasingBST(root.left);
        list.add(root);
        increasingBST(root.right);
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
