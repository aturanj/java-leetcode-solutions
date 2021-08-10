package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
 */
public class AllElementsInTwoBinarySearchTrees {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        var list = new ArrayList<Integer>();

        check(root1, list);
        check(root2, list);

        Collections.sort(list);

        return list;
    }

    private void check(TreeNode root, List list) {

        if (root != null) {

            list.add(root.val);

            if (root.left != null) {
                check(root.left, list);
            }
            if (root.right != null) {
                check(root.right, list);
            }
        }
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
