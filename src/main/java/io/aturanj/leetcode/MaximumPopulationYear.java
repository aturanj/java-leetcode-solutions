package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-population-year/
 */
public class MaximumPopulationYear {

    public int maximumPopulation(int[][] logs) {

        var map = new HashMap<Integer, Integer>();

        for (var i = 1950; i <= 2050; i++) {
            for (var pair : logs) {
                if (pair[0] <= i && pair[1] > i) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
        }

        var maxPopulation = map.values()
                .stream()
                .max((x, y) -> Integer.compare(x, y))
                .get();

        return map.entrySet()
                .stream()
                .filter(x -> Objects.equals(x.getValue(), maxPopulation))
                .min((x, y) -> Integer.compare(x.getKey(), y.getKey()))
                .get()
                .getKey();
    }

    public static void main(String[] args) {

        var maximumPopulationYear = new MaximumPopulationYear();
        var result = maximumPopulationYear.maximumPopulation(
                new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}
        );
        System.out.println("result = " + result);
        assertEquals(1960, result);
    }
}
