package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 */
public class MinimumDistanceBetweenBSTNodes {

    public int minDiffInBST(TreeNode root) {

        var list = new ArrayList<Integer>();

        check(root, list);

        var min = Integer.MAX_VALUE;

        for (var i = 0; i < list.size(); i++) {
            for (var j = 0; j < list.size(); j++) {
                if (i != j && Math.abs(list.get(i) - list.get(j)) < min) {
                    min = Math.abs(list.get(i) - list.get(j));
                }
            }
        }

        return min;
    }

    private void check(TreeNode root, List list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        check(root.left, list);
        check(root.right, list);
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
