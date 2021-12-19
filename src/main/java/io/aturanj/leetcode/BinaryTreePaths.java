package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {

    List<String> mainList = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        binaryTreePaths(root, new ArrayList<>());

        return mainList;
    }

    private void binaryTreePaths(TreeNode root, List<String> list) {

        if (root == null) {
            return;
        }

        list.add("" + root.val);

        if (root.left == null && root.right == null) {
            var sb = new StringBuilder();
            list.stream().forEach(x -> sb.append(x).append("->"));
            sb.setLength(sb.length() - 2); //remove last 2 character
            mainList.add(sb.toString());
        }

        binaryTreePaths(root.left, list.stream().collect(Collectors.toList())); //pass a new list
        binaryTreePaths(root.right, list.stream().collect(Collectors.toList())); //pass a new list
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
