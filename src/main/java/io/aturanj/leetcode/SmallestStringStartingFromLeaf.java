package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/smallest-string-starting-from-leaf/
 */
public class SmallestStringStartingFromLeaf {

    List<String> mainList = new ArrayList<>();

    public String smallestFromLeaf(TreeNode root) {

        smallestFromLeaf(root, new ArrayList<>());
        Collections.sort(mainList);

        return mainList.get(0);
    }

    private void smallestFromLeaf(TreeNode root, List<String> list) {

        if (root == null) {
            return;
        }

        list.add(("" + (char) (root.val + 65)).toLowerCase());

        if (root.left == null && root.right == null) {
            Collections.reverse(list);
            var sb = new StringBuilder();
            list.stream().forEach(x -> sb.append(x));
            mainList.add(sb.toString());
        }

        smallestFromLeaf(root.left, list.stream().collect(Collectors.toList())); //pass a new list
        smallestFromLeaf(root.right, list.stream().collect(Collectors.toList())); //pass a new list
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
