package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class FindACorrespondingNodeOfABinaryTree {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        return checkNode(cloned, target);
    }

    private TreeNode checkNode(TreeNode node, TreeNode targetNode) {

        if (node.val == targetNode.val) {
            return node;
        }

        if (node.left != null) {

            var tempNode = checkNode(node.left, targetNode);

            if (tempNode != null && tempNode.val == targetNode.val) {
                return tempNode;
            }
        }

        if (node.right != null) {

            var tempNode = checkNode(node.right, targetNode);

            if (tempNode != null && tempNode.val == targetNode.val) {
                return tempNode;
            }
        }

        return null;
    }

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {

        int val;

        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
