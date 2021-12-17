package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumII {

    List<List<Integer>> mainList = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        pathSum(root, targetSum, 0, new ArrayList<>());

        return mainList;
    }

    private void pathSum(TreeNode root, int targetSum, int sum, List<Integer> list) {

        if (root == null) {
            return;
        }

        sum += root.val;

        list.add(root.val);

        if (root.left == null && root.right == null && sum == targetSum) {
            mainList.add(list);
        }

        pathSum(root.left, targetSum, sum, list.stream().collect(Collectors.toList())); //pass a new list
        pathSum(root.right, targetSum, sum, list.stream().collect(Collectors.toList())); //pass a new list
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
