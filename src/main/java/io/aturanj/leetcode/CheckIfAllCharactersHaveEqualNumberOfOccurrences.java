package io.aturanj.leetcode;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
 */
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    public boolean areOccurrencesEqual(String s) {

        var map = new HashMap<Character, Integer>();
        for (var item : s.toCharArray()) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        return map
                .entrySet()
                .stream()
                .filter(pair -> !pair.getValue().equals(map.get(s.charAt(0))))
                .count() == 0;
    }

    public static void main(String[] args) {
        var check = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
        var result = check.areOccurrencesEqual("abacbc");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
