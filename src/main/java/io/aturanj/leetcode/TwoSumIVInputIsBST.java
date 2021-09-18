package io.aturanj.leetcode;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class TwoSumIVInputIsBST {

    private Set<Integer> set = new CopyOnWriteArraySet<>();

    public boolean findTarget(TreeNode root, int k) {

        if (root == null) {
            return false;
        }

        if (set.stream().anyMatch(item -> root.val + item == k)) {
            return true;
        }

        set.add(root.val);

        return findTarget(root.left, k) || findTarget(root.right, k);
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
