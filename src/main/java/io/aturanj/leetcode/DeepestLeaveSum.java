package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/deepest-leaves-sum/
 */
public class DeepestLeaveSum {

    List<Level> levelList = new ArrayList<>();

    public int deepestLeavesSum(TreeNode root) {

        getDeepestLeave(root, 0);

        Integer maxLevel = levelList.stream().mapToInt(l -> l.level).max().orElse(0);

        return levelList.stream().filter(x -> x.level == maxLevel).mapToInt(l -> l.val).sum();
    }

    private void getDeepestLeave(TreeNode root, int level) {

        level++;

        if (root.right == null && root.left == null) {

            levelList.add(new Level(level, root.val));

        } else {
            if (root.right != null) {
                getDeepestLeave(root.right, level);
            }

            if (root.left != null) {
                getDeepestLeave(root.left, level);
            }
        }
    }

    private class Level {

        private int level;
        private int val;

        public Level(int level, int val) {
            this.level = level;
            this.val = val;
        }
    }

    /**
     * Definition for a binary tree node.
     */
    private class TreeNode {

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
