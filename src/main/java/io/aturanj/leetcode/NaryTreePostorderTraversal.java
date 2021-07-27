package io.aturanj.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class NaryTreePostorderTraversal {

    List<Integer> list = new LinkedList<>();

    public List<Integer> postorder(Node root) {

        if (root == null) {
            return new LinkedList<>();
        }

        root.children.forEach(item -> {
            postorder(item);
        });

        list.add(root.val);

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
