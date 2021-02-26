package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) {
            return null;
        }

        return buildBst(nums, 0, nums.length - 1);
    }

    private TreeNode buildBst(int[] nums, int leftIndex, int rightIndex) {

        if (leftIndex > rightIndex) {
            return null;
        }

        var middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

        var current = new TreeNode(nums[middleIndex]);

        current.left = buildBst(nums, leftIndex, middleIndex - 1);

        current.right = buildBst(nums, middleIndex + 1, rightIndex);

        return current;
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
