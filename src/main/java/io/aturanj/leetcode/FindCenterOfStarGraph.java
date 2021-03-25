package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/find-center-of-star-graph
 */
public class FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {

        // check only fist 2 sub array
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) {
            return edges[0][1];
        }

        return 0;
    }

    public static void main(String[] args) {

        FindCenterOfStarGraph findCenterOfStarGraph = new FindCenterOfStarGraph();
        var result = findCenterOfStarGraph.findCenter(new int[][]{{1, 2}, {5, 1}, {1, 3}, {1, 4}});

        System.out.println("result = " + result);
    }
}
