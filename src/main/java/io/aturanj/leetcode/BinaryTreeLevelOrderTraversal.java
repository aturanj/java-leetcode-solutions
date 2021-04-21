package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversal {

    List<List<Integer>> mainListVals = new ArrayList<>();
    List<List<TreeNode>> mainListNodes = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return mainListVals;
        }

        var rtv = new ArrayList<Integer>();
        rtv.add(root.val);
        mainListVals.add(rtv);

        var rt = new ArrayList<TreeNode>();
        rt.add(root);
        mainListNodes.add(rt);

        if (root.right != null || root.left != null) {
            AddNewLevel();
        }

        return mainListVals;
    }

    private void AddNewLevel() {

        boolean haveNewLevel = false;

        ArrayList<Integer> listVals = new ArrayList<>();
        ArrayList<TreeNode> listNodes = new ArrayList<>();

        var level = mainListNodes.size() - 1;

        var tempList = mainListNodes.get(level);

        for (int i = 0; i < tempList.size(); i++) {

            if (tempList.get(i).left != null) {
                listVals.add(tempList.get(i).left.val);
                listNodes.add(tempList.get(i).left);

                if (tempList.get(i).left.right != null || tempList.get(i).left.left != null) {
                    haveNewLevel = true;
                }
            }

            if (tempList.get(i).right != null) {
                listVals.add(tempList.get(i).right.val);
                listNodes.add(tempList.get(i).right);

                if (tempList.get(i).right.right != null || tempList.get(i).right.left != null) {
                    haveNewLevel = true;
                }
            }

        }

        mainListNodes.add(listNodes);
        mainListVals.add(listVals);

        if (haveNewLevel) {
            AddNewLevel();
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
