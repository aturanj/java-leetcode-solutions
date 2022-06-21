package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTree {

    List<TreeNode> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {

        traverse(root);

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i).left = null;
        }

        list.get(list.size() - 1).right = null;
        list.get(list.size() - 1).left = null;

        return list.get(0);
    }

    private void traverse(TreeNode root) {
        if (root != null) {
            //InOrder traversing
            traverse(root.left);
            list.add(root);
            traverse(root.right);
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
