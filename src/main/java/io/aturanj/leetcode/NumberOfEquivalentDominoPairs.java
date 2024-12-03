package io.aturanj.leetcode;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
 */
public class NumberOfEquivalentDominoPairs {

    public int numEquivDominoPairs(int[][] dominoes) {

        var map = new HashMap<Integer, Integer>();
        int pairs = 0;

        for (var domino : dominoes) {
            int key = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0], domino[1]); //if we have 3-figure we could multiply with 100
            pairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return pairs;
    }

    public static void main(String[] args) {

        var arr = new int[][]{{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        var dominoPairs = new NumberOfEquivalentDominoPairs();
        var result = dominoPairs.numEquivDominoPairs(arr);
        var expectation = 3;

        assertEquals(expectation, result);
    }
}
