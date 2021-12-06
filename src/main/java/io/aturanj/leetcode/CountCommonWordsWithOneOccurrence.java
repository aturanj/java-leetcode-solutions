package io.aturanj.leetcode;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-common-words-with-one-occurrence/
 */
public class CountCommonWordsWithOneOccurrence {

    public int countWords(String[] words1, String[] words2) {

        var mapOne = new HashMap<String, Integer>();
        var mapTwo = new HashMap<String, Integer>();

        for (var item : words1) {
            mapOne.put(item, mapOne.getOrDefault(item, 0) + 1);
        }

        for (var item : words2) {
            mapTwo.put(item, mapTwo.getOrDefault(item, 0) + 1);
        }

        return (int) mapOne.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1
                && mapTwo.keySet().contains(e.getKey())
                && mapTwo.get(e.getKey()) == 1)
                .count();
    }

    public static void main(String[] args) {
        var count = new CountCommonWordsWithOneOccurrence();
        var result = count.countWords(
                new String[]{"leetcode", "is", "amazing", "as", "is"},
                new String[]{"amazing", "leetcode", "is"}
        );
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
