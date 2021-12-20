package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbers {

    List<String> mainList = new ArrayList<>();

    public int sumNumbers(TreeNode root) {

        sumNumbers(root, null, new ArrayList<>());

        return mainList.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .sum();
    }

    private void sumNumbers(TreeNode root, TreeNode parent, List<Integer> list) {

        if (root == null) {
            return;
        }

        list.add(root.val);

        if (root.left == null && root.right == null) {
            var sb = new StringBuilder();
            list.stream().forEach(x -> sb.append(x));
            mainList.add(sb.toString());
            return;
        }

        sumNumbers(root.left, root, list.stream().collect(Collectors.toList())); //pass a new list
        sumNumbers(root.right, root, list.stream().collect(Collectors.toList()));//pass a new list
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
