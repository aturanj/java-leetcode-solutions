package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/clone-graph/
 */
public class CloneGraph {

    public Map<Node, Node> visitedNodeList = new HashMap<>();

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        if (visitedNodeList.containsKey(node)) {
            return visitedNodeList.get(node);
        }

        var newNode = new Node(node.val, new ArrayList<Node>());
        visitedNodeList.put(node, newNode);

        for (var neigbour : node.neighbors) {
            newNode.neighbors.add(cloneGraph(neigbour));
        }

        return newNode;
    }

    // Definition for a Node.
    private class Node {

        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
