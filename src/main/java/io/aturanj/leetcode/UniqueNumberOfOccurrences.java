package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        var map = new HashMap<Integer, Integer>();

        for (var item : arr) {
            map.put(item, map.get(item) == null ? 1 : map.get(item) + 1);
        }

        var set = new HashSet<Integer>();

        return map
                .values()
                .stream()
                .anyMatch(x -> {
                    return set.add(x) == false;
                }) != true;

    }

    public static void main(String[] args) {
        UniqueNumberOfOccurrences numberOfOccurrences = new UniqueNumberOfOccurrences();
        var result = numberOfOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        System.out.println("result = " + result);
    }
}
