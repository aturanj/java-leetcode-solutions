package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/find-if-path-exists-in-graph/
 */
public class FindIfPathExistInGraph {

    public Set visitedVertexList = new HashSet<Integer>();
    public Map<Integer, ArrayList<Integer>> map = new HashMap();

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        for (var row : edges) {

            map.putIfAbsent(row[0], new ArrayList<>());
            map.putIfAbsent(row[1], new ArrayList<>());

            //bidirectional
            map.get(row[0]).add(row[1]);
            map.get(row[1]).add(row[0]);
        }

        return find(source, destination);
    }

    public boolean find(int currentVertex, int destinationVertex) {

        if (currentVertex == destinationVertex) {
            return true;
        }

        for (var neigbour : map.get(currentVertex)) {
            if (visitedVertexList.add(neigbour) && find(neigbour, destinationVertex)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        FindIfPathExistInGraph findIfPathExistInGraph = new FindIfPathExistInGraph();
        var result = findIfPathExistInGraph.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2);

        System.out.println("result = " + result);

        assertTrue(result);
    }
}
