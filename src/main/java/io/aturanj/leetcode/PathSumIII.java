package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/path-sum-iii/
 */
public class PathSumIII {

    private int counter;

    public int pathSum(TreeNode root, int targetSum) {

        pathSum(root, targetSum, new ArrayList<>());

        return counter;
    }

    private void pathSum(TreeNode root, int targetSum, List<Integer> list) {

        if (root == null) {
            return;
        }

        list.add(root.val);
        var sum = 0;

        for (var i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            if (sum == targetSum) {
                counter++;
            }
        }

        pathSum(root.left, targetSum, list.stream().collect(Collectors.toList())); //pass a new list
        pathSum(root.right, targetSum, list.stream().collect(Collectors.toList())); //pass a new list
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
