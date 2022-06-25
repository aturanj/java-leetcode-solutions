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

        var lastIndex = list.size() - 1;

        for (int i = 0; i < lastIndex; i++) {
            var currentNode = list.get(i);
            currentNode.right = list.get(i + 1); // next node
            currentNode.left = null;
        }

        var lastNode = list.get(lastIndex);
        lastNode.right = null; // preventing cycle
        lastNode.left = null; // preventing cycle

        return list.get(0); // first node
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
