package io.aturanj.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class NaryTreePreorderTraversal {

    List<Integer> list = new LinkedList<>();

    public List<Integer> preorder(Node root) {

        if (root == null) {
            return new LinkedList<>();
        }

        list.add(root.val);

        root.children.forEach(item -> {
            preorder(item);
        });

        return list;
    }

    class Node {

        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
