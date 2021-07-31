package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {

    private List<Integer> list = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList<>();
        }

        postorderTraversal(root.left);

        postorderTraversal(root.right);

        list.add(root.val);

        return list;
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
