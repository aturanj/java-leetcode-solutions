package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {

        var map = new HashMap<Integer, Integer>();
        check(root, map);

        var mostFrequentValue = map
                .values()
                .stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);

        return map
                .keySet()
                .stream()
                .filter(x -> map.get(x) == mostFrequentValue)
                .mapToInt(x -> x)
                .toArray();
    }

    private void check(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        check(root.left, map);
        check(root.right, map);
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
